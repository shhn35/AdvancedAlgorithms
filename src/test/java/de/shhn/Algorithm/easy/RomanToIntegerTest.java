package de.shhn.Algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {
    @Test
    public void trivialTest1(){
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "III";
        int expected = 3;

        Assert.assertEquals(expected,romanToInteger.romanToInt(input));
    }

    @Test
    public void trivialTest2(){
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "IV";
        int expected = 4;

        Assert.assertEquals(expected,romanToInteger.romanToInt(input));
    }

    @Test
    public void trivialTest3(){
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "IX";
        int expected = 9;

        Assert.assertEquals(expected,romanToInteger.romanToInt(input));
    }

    @Test
    public void trivialTest4(){
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "LVIII";
        int expected = 58;

        Assert.assertEquals(expected,romanToInteger.romanToInt(input));
    }

    @Test
    public void trivialTest5(){
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "MCMXCIV";
        int expected = 1994;

        Assert.assertEquals(expected,romanToInteger.romanToInt(input));
    }

    @Test
    public void trivialTest6(){
        RomanToInteger romanToInteger = new RomanToInteger();
        String input = "VI";
        int expected = 6;

        Assert.assertEquals(expected,romanToInteger.romanToInt(input));
    }
}
