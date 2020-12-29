package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRemoveToMakeValidParenthesesTest {
    @Test
    public void trivialTest1(){
        MinimumRemoveToMakeValidParentheses validParentheses =
                new MinimumRemoveToMakeValidParentheses();

        String input = "lee(t(c)o)de)";
        String expected ="lee(t(c)o)de";
        String actual = validParentheses.minRemoveToMakeValid(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void trivialTest2(){
        MinimumRemoveToMakeValidParentheses validParentheses =
                new MinimumRemoveToMakeValidParentheses();

        String input = "))((";
        String expected ="";
        String actual = validParentheses.minRemoveToMakeValid(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void trivialTest3(){
        MinimumRemoveToMakeValidParentheses validParentheses =
                new MinimumRemoveToMakeValidParentheses();

        String input = "(a(b(c)d)";
        String expected ="a(b(c)d)";
        String actual = validParentheses.minRemoveToMakeValid(input);

        Assert.assertEquals(expected,actual);
    }
}
