package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedSortedArrayTest {
    @Test
    public void TrivialTest1(){
        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
        int[] input_arr = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        int expected = 4;

        Assert.assertEquals(expected,search.search(input_arr,target));
    }

    @Test
    public void TrivialTest2(){
        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
        int[] input_arr = new int[]{4,5,6,7,0,1,2};
        int target = 3;
        int expected = -1;

        Assert.assertEquals(expected,search.search(input_arr,target));
    }

    @Test
    public void TrivialTest3(){
        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
        int[] input_arr = new int[]{1};
        int target = 0;
        int expected = -1;

        Assert.assertEquals(expected,search.search(input_arr,target));
    }
}
