package de.shhn.Algorithm.hard;

import org.junit.Assert;
import org.junit.Test;

public class MinimumWindowSubstringTest {
    @Test
    public void trivialTest1(){
        MinimumWindowSubstring windowSubstring = new MinimumWindowSubstring();
        String input = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";

        Assert.assertEquals(expected,windowSubstring.minWindow(input,t));
    }

    @Test
    public void trivialTest2(){
        MinimumWindowSubstring windowSubstring = new MinimumWindowSubstring();
        String input = "a";
        String t = "a";
        String expected = "a";

        Assert.assertEquals(expected,windowSubstring.minWindow(input,t));
    }

    @Test
    public void trivialTest3(){
        MinimumWindowSubstring windowSubstring = new MinimumWindowSubstring();
        String input = "ABADBACA";
        String t = "AABC";
        String expected = "BACA";

        Assert.assertEquals(expected,windowSubstring.minWindow(input,t));
    }
}
