package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

public class ProductOfArrayExceptSelfTest {
    @Test
    public void trivialTest(){
        int[] nums = new int[]{1,2,3,4};
        int[] expected = new int[]{24,12,8,6};
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

        Assert.assertArrayEquals(expected,productOfArrayExceptSelf.productExceptSelf(nums));
    }
}
