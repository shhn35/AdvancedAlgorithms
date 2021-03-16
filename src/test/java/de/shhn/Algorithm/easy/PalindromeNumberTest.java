package de.shhn.Algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    @Test
    public void trivialTest1(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int input = 121;
        boolean expected = true;

        Assert.assertEquals(expected,palindromeNumber.isPalindrome(input));
    }

    @Test
    public void trivialTest2(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int input = -121;
        boolean expected = false;

        Assert.assertEquals(expected,palindromeNumber.isPalindrome(input));
    }

    @Test
    public void trivialTest3(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int input = 1235321;
        boolean expected = true;

        Assert.assertEquals(expected,palindromeNumber.isPalindrome(input));
    }

    @Test
    public void trivialTest4(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int input = 1221;
        boolean expected = true;

        Assert.assertEquals(expected,palindromeNumber.isPalindrome(input));
    }

    @Test
    public void trivialTest5(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int input = 1;
        boolean expected = true;

        Assert.assertEquals(expected,palindromeNumber.isPalindrome(input));
    }

    @Test
    public void trivialTest6(){
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int input = 10;
        boolean expected = false;

        Assert.assertEquals(expected,palindromeNumber.isPalindrome(input));
    }
}
