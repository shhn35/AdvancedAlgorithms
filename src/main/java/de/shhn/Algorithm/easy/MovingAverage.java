package de.shhn.Algorithm.easy;

import java.util.LinkedList;

public class MovingAverage {

    private int windowSize;
    private int first=0;
    private double sum=0;
    LinkedList<Integer> linkedList = new LinkedList<>();

    public MovingAverage(int size) {
        this.windowSize = size;
    }

    public double next(int val) {
        if(linkedList.size() == windowSize)
            first = linkedList.removeFirst();

        linkedList.add(val);

        sum -= first;
        sum += val;

        return sum / linkedList.size();
    }
}
