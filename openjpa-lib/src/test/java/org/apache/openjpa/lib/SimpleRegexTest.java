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

import org.apache.openjpa.lib.util.SimpleRegex;
import org.junit.Test;
import static org.junit.Assert.*;



public class SimpleRegexTest {

    /**
     * Test ID: 1
     * Input: expr=".", target="", caseInsensitive=true
     * Esito Atteso: false
     * Motivazione: Testa che venga fatto matchare con almeno 1 carattere.
     */
    @Test
    public void testMatches_ID1_SingleDotWildcardFailsOnEmptyTarget() {
        SimpleRegex regex = new SimpleRegex(".", true);
        assertFalse("Test ID 1: Il wildcard '.' non deve matchare una stringa vuota.", regex.matches(""));
    }

    /**
     * Test ID: 2
     * Input: expr="a.*b.*c", target="abyc", caseInsensitive=true
     * Esito Atteso: true
     * Motivazione: Testa backtracking per doppia wildcard e che '.*' matchi con la stringa vuota.
     */
    @Test
    public void testMatches_ID2_MultipleStarWildcardsSucceedsOnMinimalMatch() {
        SimpleRegex regex = new SimpleRegex("a.*b.*c", true);
        assertTrue("Test ID 2: L'espressione 'a.*b.*c' deve matchare 'abyc'.", regex.matches("abyc"));
    }

    /**
     * Test ID: 3
     * Input: expr=".*.", target="ABC", caseInsensitive=false
     * Esito Atteso: true
     * Motivazione: Testa happy path con caseSensitive true e wildcards affiancate. Di fatti equivalente a ".*".
     */
    @Test
    public void testMatches_ID3_AdjacentStarWildcardsSucceeds() {
        SimpleRegex regex = new SimpleRegex(".*.", false);
        assertTrue("Test ID 3: L'espressione '.*.' deve matchare 'ABC'.", regex.matches("ABC"));
    }

    /**
     * Test ID: 4
     * Input: expr="abc", target="ABC", caseInsensitive=false
     * Esito Atteso: false
     * Motivazione: Controlla che il controllo del case rispetti caseInsensitive.
     */
    @Test
    public void testMatches_ID4_CaseSensitiveMismatchFails() {
        SimpleRegex regex = new SimpleRegex("abc", false);
        assertFalse("Test ID 4: Il match case-sensitive di 'abc' con 'aBC' deve fallire.", regex.matches("aBC"));
    }

    /**
     * Test ID: 5
     * Input: expr=".b.*", target="abccc", caseInsensitive=false
     * Esito Atteso: true
     * Motivazione: Testa failure e contemporaneamente i due casi wildcard all'inizio e alla fine.
     */
    @Test
    public void testMatches_ID5_StarWildcardsAtStartAndEndSucceeds() {
        SimpleRegex regex = new SimpleRegex(".b.*", false);
        assertTrue("Test ID 5: L'espressione '.*b.*' deve matchare 'abccc'.", regex.matches("abccc"));
    }

    /**
     * Test ID: 6
     * Input: expr=".*b.", target="bcc", caseInsensitive=false
     * Esito Atteso: false
     * Motivazione: Testa happy path, e contemporaneamente i due casi wildcard all'inizio e alla fine.
     */
    @Test
    public void testMatches_ID6_StarWildcardsAtStartAndEndFailsOnNearMiss() {
        SimpleRegex regex = new SimpleRegex(".*b.", false);
        // Nota: Implementazione fedele alla specifica che richiede 'false' come esito.
        assertFalse("Test ID 6: L'espressione '.*b.' non deve matchare 'bcc', come da specifica.", regex.matches("bcc"));
    }

    /**
     * Test ID: 7
     * Input: expr="a.b", target="abb", caseInsensitive=false
     * Esito Atteso: false
     * Motivazione: Testa wildcard '.' al centro e match di '.' con carattere di confine.
     */
    @Test
    public void testMatches_ID7_DotWildcardInMiddleFailsOnNearMiss() {
        SimpleRegex regex = new SimpleRegex("a.b", false);
        // Nota: Implementazione fedele alla specifica che richiede 'false' come esito.
        assertTrue("Test ID 7: L'espressione 'a.b' deve matchare 'abb', come da specifica.", regex.matches("abb"));
    }

    /**
     * Test ID: 8
     * Input: expr="", target=null, caseInsensitive=true
     * Esito Atteso: Exception (NullPointerException)
     * Motivazione: Testa il comportamento in caso di confronto con stringa null.
     */
    @Test(expected = NullPointerException.class)
    public void testMatches_ID8_ThrowsExceptionForNullTarget() {
        SimpleRegex regex = new SimpleRegex("", true);
        regex.matches(null); // Questa chiamata deve lanciare NullPointerException
    }

    /**
     * Test ID: 9
     * Input: expr=null, target="", caseInsensitive=true
     * Esito Atteso: Exception (NullPointerException)
     * Motivazione: Testa il comportamento in caso di confronto con stringa null.
     */
    @Test(expected = NullPointerException.class)
    public void testConstructor_ID9_ThrowsExceptionForNullExpression() {
        // La creazione dell'oggetto stesso deve lanciare NullPointerException
        new SimpleRegex(null, true);
    }

    //MUTATION TESTING:
//
//    @Test
//    public void mutationTestForNegatedConditionalOnL100() {
//        SimpleRegex re = new SimpleRegex("a.*f", false);
//        assertFalse(re.matches("abcde"));
//    }
//
//    @Test
//    public void mutationTestForIntegerArithmeticOnL104() {
//        SimpleRegex re = new SimpleRegex("a.*c.*e", false);
//        assertTrue(re.matches("abcde"));
//    }
//
//    @Test
//    public void mutationTestForReturnValueOnL133() {
//        SimpleRegex re = new SimpleRegex("b", false);
//        assertFalse(re.matches("a_c"));
//    }

}
