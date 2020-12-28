package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

public class SubarraySumEqualsKTest {
    @Test
    public void trivialTest(){
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

        // test 1
        int[] nums = {1,2,3};
        int k = 3;
        int expected = 2;

        int output = subarraySumEqualsK.subarraySum(nums,k);

        Assert.assertEquals(expected,output);


        // test 2
        nums = new int[]{-1,-1,1,0,1,0};
        k = 0;
        expected = 6;

        output = subarraySumEqualsK.subarraySum(nums,k);

        Assert.assertEquals(expected,output);



    }
}
