package de.shhn.Algorithm.easy;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void TwoSumAllTests(){
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{};
        int target = 0;
        int[] expected = new int[]{-1,-1};

        // Test 1 : Empty Array
        assertArrayEquals(expected,twoSum.findTwoSum(nums,target));

        // Test 2 : Regular positive Array
        nums = new int[]{10,20,7,4,0,20,6,8,16,5};
        target = 13;
        expected = new int[]{2,6};
        assertArrayEquals(expected, twoSum.findTwoSum(nums,target));

        // Test 3 : Regular Array with negative
        nums = new int[]{10,3,-7,4,0,-20,6,-8,16,5,7,-5};
        target = -20;
        expected = new int[]{4,5};
        assertArrayEquals(expected, twoSum.findTwoSum(nums,target));

        // Test 4 : Regular Array with negative
        nums = new int[]{10,13,-7,4,1,-21,6,-18,16,-3,-17,-5};
        target = -7;
        expected = new int[]{0,10};
        assertArrayEquals(expected, twoSum.findTwoSum(nums,target));
    }
}
