package org.apache.openjpa.lib;

import org.apache.openjpa.lib.util.SimpleRegex;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestSimpleRegex {

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

}
