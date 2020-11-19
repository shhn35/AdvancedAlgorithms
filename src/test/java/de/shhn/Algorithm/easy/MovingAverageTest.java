package de.shhn.Algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovingAverageTest {
    @Test
    public void trivialTest(){
        MovingAverage movingAverage = new MovingAverage(3);
        double expected = 1;
        assertEquals(expected,movingAverage.next(1),3.0);
        expected = (10+1)/2;
        assertEquals(expected,movingAverage.next(10),3d);
        expected = (1+10+3)/3;
        assertEquals(expected,movingAverage.next(3),3d);
        expected = (10+3+5)/3;
        assertEquals(expected,movingAverage.next(5),3d);

    }
}
