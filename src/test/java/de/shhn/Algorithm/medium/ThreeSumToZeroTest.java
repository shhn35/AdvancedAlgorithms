package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ThreeSumToZeroTest {
    @Test
    public void threeSumTrivialTest(){
        ThreeSumToZero threeSumToZero = new ThreeSumToZero();

        // TestOne
        int[] input = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>(Arrays.asList(-1,-1,2)));
        expected.add(new ArrayList<Integer>(Arrays.asList(-1,0,1)));

        assertArrayEquals(expected.toArray(),threeSumToZero.threeSum(input).toArray());

        // Test Two
        input = new int[]{};
        expected = new ArrayList<>();

        assertArrayEquals(expected.toArray(),threeSumToZero.threeSum(input).toArray());

        // Test Three
        input = new int[]{0};
        expected = new ArrayList<>();

        assertArrayEquals(expected.toArray(),threeSumToZero.threeSum(input).toArray());
    }
}
