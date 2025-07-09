/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.openjpa.lib;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.openjpa.lib.util.SimpleRegex;

public class LLMSimpleRegexTest {

    /**
     * Test che verifica una corrispondenza esatta senza wildcard.
     * Corrispondenza case-sensitive.
     */
    @Test
    public void testExactMatchCaseSensitive() {
        SimpleRegex regex = new SimpleRegex("HelloWorld", false);
        assertTrue(regex.matches("HelloWorld"));
    }

    /**
     * Test che verifica che una stringa non corrisponda a causa della differenza di case.
     * Case-sensitive, quindi 'h' != 'H'.
     */
    @Test
    public void testExactMatchCaseSensitiveFail() {
        SimpleRegex regex = new SimpleRegex("HelloWorld", false);
        assertFalse(regex.matches("helloworld"));
    }

    /**
     * Test con abilitazione case-insensitive: la differenza di maiuscole/minuscole è ignorata.
     */
    @Test
    public void testExactMatchCaseInsensitive() {
        SimpleRegex regex = new SimpleRegex("HelloWorld", true);
        assertTrue(regex.matches("hElLoWoRlD"));
    }

    /**
     * Test con wildcard '.' che sostituisce un singolo carattere.
     * La stringa "qu.ck" deve combaciare con "quick".
     */
    @Test
    public void testSingleCharWildcard() {
        SimpleRegex regex = new SimpleRegex("qu.ck", false);
        assertTrue(regex.matches("quick"));
        assertFalse(regex.matches("quuuck"));  // Troppi caratteri
    }

    /**
     * Test con wildcard '.*' che rappresenta zero o più caratteri.
     * La stringa può contenere qualsiasi sequenza dove indicato.
     */
    @Test
    public void testMultiCharWildcard() {
        SimpleRegex regex = new SimpleRegex("The .* dog", false);
        assertTrue(regex.matches("The big brown dog"));
        assertTrue(regex.matches("The  dog")); // anche zero caratteri
        assertFalse(regex.matches("A big brown dog")); // non inizia con "The"
    }

    /**
     * Test combinato con '.' e '.*'.
     * Simula un'espressione complessa ma supportata.
     */
    @Test
    public void testCombinedWildcards() {
        SimpleRegex regex = new SimpleRegex("A qu.ck .* fox", false);
        assertTrue(regex.matches("A quick orange fox"));
        assertTrue(regex.matches("A quack fast fox"));
        assertFalse(regex.matches("A quick orange cat")); // finisce diversamente
    }

    /**
     * Test su espressione che termina con '.*': deve accettare qualsiasi finale.
     */
    @Test
    public void testEndsWithWildcard() {
        SimpleRegex regex = new SimpleRegex("Start.*", false);
        assertTrue(regex.matches("Start here"));
        assertTrue(regex.matches("Start"));
        assertFalse(regex.matches("Begin here"));
    }

    /**
     * Test su espressione che inizia con '.*': deve accettare qualsiasi prefisso.
     */
    @Test
    public void testStartsWithWildcard() {
        SimpleRegex regex = new SimpleRegex(".*end", false);
        assertTrue(regex.matches("To the end"));
        assertTrue(regex.matches("end"));
        assertFalse(regex.matches("ending")); // non finisce esattamente con "end"
    }

    /**
     * Test su espressione con '.*' al centro che permette contenuto libero nel mezzo.
     */
    @Test
    public void testWildcardInMiddle() {
        SimpleRegex regex = new SimpleRegex("pre.*post", false);
        assertTrue(regex.matches("pre123post"));
        assertTrue(regex.matches("prepost"));
        assertFalse(regex.matches("propost")); // errore nel prefisso
    }

    /**
     * Test di match con stringa vuota e espressione vuota: deve essere true.
     */
    @Test
    public void testEmptyStringAndPattern() {
        SimpleRegex regex = new SimpleRegex("", false);
        assertTrue(regex.matches(""));
        assertFalse(regex.matches("nonempty"));
    }

    /**
     * Test: espressione vuota con target non vuoto -> deve restituire false.
     */
    @Test
    public void testEmptyPatternNonEmptyTarget() {
        SimpleRegex regex = new SimpleRegex("", false);
        assertFalse(regex.matches("some text"));
    }

    /**
     * Test: espressione '.*' deve accettare qualsiasi stringa.
     */
    @Test
    public void testUniversalMatch() {
        SimpleRegex regex = new SimpleRegex(".*", false);
    }
}