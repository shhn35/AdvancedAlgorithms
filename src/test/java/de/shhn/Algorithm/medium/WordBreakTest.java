package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WordBreakTest {
    @Test
    public void hardTest(){
        WordBreak wordBreak = new WordBreak();

        String input = "aaaaaaa";
        List<String> dict = new ArrayList<>();
        dict.add("aaaa");
        dict.add("aaa");

        boolean expected = true;
        Assert.assertEquals(expected,wordBreak.wordBreak(input,dict));

    }
}
