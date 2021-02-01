package de.shhn.Algorithm.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> out = new ArrayList();
        Arrays.sort(intervals,(A, B)->A[0]-B[0]);

        int[] mergedElement = intervals[0];

        for(int i=1;i<intervals.length;i++){
            if(mergedElement[1] >= intervals[i][0])
                mergedElement[1] = Math.max(mergedElement[1],intervals[i][1]);
            else{
                out.add(mergedElement);
                mergedElement = intervals[i];
            }
        }

        out.add(mergedElement);

        return out.toArray(new int[out.size()][2]);
    }
}
