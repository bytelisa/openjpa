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

    @Test
    public void testCase1(){
        SimpleRegex re = new SimpleRegex(".", true);
        assertFalse(re.matches(""));
    }
    @Test
    public void testCase2(){
        SimpleRegex re = new SimpleRegex("a.*b",false);
        assertTrue(re.matches("ab"));
    }
    @Test
    public void testCase3(){
        SimpleRegex re = new SimpleRegex(".*MARZIOLI", true);
        assertTrue(re.matches("elisa marzioli"));
    }
    @Test
    public void testCase4(){
        SimpleRegex re = new SimpleRegex("abc", true);
        assertFalse(re.matches("ABCd"));
    }
    @Test
    public void testCase5(){
        SimpleRegex re = new SimpleRegex("..*", false);
        assertFalse(re.matches(""));
    }
    @Test
    public void testCase6(){
        SimpleRegex re = new SimpleRegex("Elisa.*", false);
        assertFalse(re.matches("ELISA"));
    }
    @Test
    public void testCase7(){
        SimpleRegex re = new SimpleRegex("a.b.c", true);
        assertTrue(re.matches("a$b£c"));
    }
    @Test
    public void testCase8(){
        SimpleRegex re = new SimpleRegex("Elisa.", false);
        assertFalse(re.matches("Elisa"));
    }
    @Test
    public void testCase9(){
        SimpleRegex re = new SimpleRegex(".*Elisa", false);
        assertFalse(re.matches("eLISA"));
    }
    @Test
    public void testCase10(){
        SimpleRegex re = new SimpleRegex("Elisa.*.*", true);
        assertTrue(re.matches("eLISA"));
    }

    @Test(expected = NullPointerException.class)
    public void testCase11() {
        new SimpleRegex(null, true);
    }

    @Test(expected = NullPointerException.class)
    public void testCase12() {
        SimpleRegex re = new SimpleRegex(".*", false);
        re.matches(null);
    }

    //MUTATION TESTING:

    @Test
    public void mutationTestForNegatedConditionalOnL100() {
        SimpleRegex re = new SimpleRegex("a.*f", false);
        assertFalse(re.matches("abcde"));
    }

    @Test
    public void mutationTestForIntegerArithmeticOnL104() {
        SimpleRegex re = new SimpleRegex("a.*c.*e", false);
        assertTrue(re.matches("abcde"));
    }

    @Test
    public void mutationTestForReturnValueOnL133() {
        SimpleRegex re = new SimpleRegex("b", false);
        assertFalse(re.matches("a_c"));
    }

}
