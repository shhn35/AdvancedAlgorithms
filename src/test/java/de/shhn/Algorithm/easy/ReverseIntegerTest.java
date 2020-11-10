package de.shhn.Algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {
    @Test
    public void trivialTests(){
        int input =123, expected = 321;
        ReverseInterger reverseInterger = new ReverseInterger();

        assertEquals(expected,reverseInterger.reverse(input));

        input = -123;
        expected = -321;
        assertEquals(expected,reverseInterger.reverse(input));

        input = 150;
        expected = 51;
        assertEquals(expected,reverseInterger.reverse(input));

        // out of range test
        input = Integer.MAX_VALUE; // the reverse would be 76721 -> invalid
        expected = 0;
        assertEquals(expected,reverseInterger.reverse(input));

        // out of range test
        input = Integer.MIN_VALUE; // the reverse would be -86721 -> invalid
        expected = 0;
        assertEquals(expected,reverseInterger.reverse(input));
    }
}
