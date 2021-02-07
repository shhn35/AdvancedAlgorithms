package de.shhn.Algorithm.medium;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> out = new ArrayList();
        int iIdx = 0;
        int jIdx = 0;
        int start,end;
        while(iIdx < firstList.length && jIdx < secondList.length){
            start = Math.max(firstList[iIdx][0],secondList[jIdx][0]);
            end = Math.min(firstList[iIdx][1],secondList[jIdx][1]);

            if(start<=end){
                out.add(new int[]{start,end});
            }
            if(firstList[iIdx][1] <= secondList[jIdx][1]){
                iIdx++;
            }else{
                jIdx++;
            }
        }
        return out.toArray(new int[out.size()][]);
    }
}
