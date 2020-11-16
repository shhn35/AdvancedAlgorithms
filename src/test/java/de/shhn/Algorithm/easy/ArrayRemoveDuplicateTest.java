package de.shhn.Algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayRemoveDuplicateTest {
    @Test
    public void trivialTest(){
        ArrayRemoveDuplicate arrayRemoveDuplicate= new ArrayRemoveDuplicate();

        int[] input = {1,1,2};
        int[] expected = {1,2};

        int len = arrayRemoveDuplicate.removeDuplicate(input);
        int[] actual = new int[len];

        for(int i = 0;i<len;i++)
            actual[i]=input[i];

        assertArrayEquals(expected,actual);


        // Test case 2
        input = new int[]{0,0,1,1,1,2,2,3,3,4};
        expected = new int[]{0,1,2,3,4};
        len = arrayRemoveDuplicate.removeDuplicate(input);
        actual = new int[len];

        for(int i = 0;i<len;i++)
            actual[i]=input[i];

        assertArrayEquals(expected,actual);


    }
}
