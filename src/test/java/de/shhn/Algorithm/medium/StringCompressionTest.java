package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

public class StringCompressionTest {
    @Test
    public void trivialTest1(){
        StringCompression stringCompression = new StringCompression();

        char[] input ={'a','a','b','b','c','c','c'};
        String expected ="a2b2c3";

        int actualSize = stringCompression.compress(input);
        String actual = "";

        for(int i = 0; i < actualSize; i++){
            actual += input[i];
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void trivialTest2(){
        StringCompression stringCompression = new StringCompression();

        char[] input ={'a'};
        String expected ="a";

        int actualSize = stringCompression.compress(input);
        String actual = "";

        for(int i = 0; i < actualSize; i++){
            actual += input[i];
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void trivialTest3(){
        StringCompression stringCompression = new StringCompression();

        char[] input ={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        String expected ="ab12";

        int actualSize = stringCompression.compress(input);
        String actual = "";

        for(int i = 0; i < actualSize; i++){
            actual += input[i];
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void trivialTest4(){
        StringCompression stringCompression = new StringCompression();

        char[] input ={'a','a','a','b','b','a','a'};
        String expected ="a3b2a2";

        int actualSize = stringCompression.compress(input);
        String actual = "";

        for(int i = 0; i < actualSize; i++){
            actual += input[i];
        }

        Assert.assertEquals(expected,actual);
    }
}
