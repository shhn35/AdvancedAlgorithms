package de.shhn.Algorithm.medium;

import org.junit.Assert;
import org.junit.Test;

public class IntervalListIntersectionsTest {
    @Test
    public void trivialTest(){
        IntervalListIntersections intervalListIntersections = new IntervalListIntersections();
        int[][] list1 = new int[][]{{0,2},{5,10},{13,23},{24,25}};
        int[][] list2 = new int[][]{{1,5},{8,12}, {15, 24},{25,26}};
        int[][] expected = new int[][]{{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}};

        Assert.assertArrayEquals(expected,intervalListIntersections.intervalIntersection(list1,list2));

    }
}
