package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

public class TopKFrequentElementsTest {
    @Test
    public void trivialTest(){
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;
        int[] expected = new int[]{2,1};
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

        Assert.assertArrayEquals(expected,topKFrequentElements.topKFrequent(nums,k));
    }
}
