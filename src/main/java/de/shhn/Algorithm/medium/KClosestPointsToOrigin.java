package de.shhn.Algorithm.medium;

import java.util.Arrays;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
// First Approach with sort o(n log n)
        // int[][] out = new int[K][2];
        // int[][] distance = new int[points.length][2];
        // for(int i=0;i<points.length;i++){
        //     // distance[i][0] = points[i][0] ^ 2 + points[i][1] ^2;
        //     distance[i][0] = (int)(Math.pow(points[i][0] , 2) + Math.pow(points[i][1] , 2));
        //     distance[i][1] = i;
        // }
        // Arrays.sort(distance,(A,B)->A[0]-B[0]);
        // for(int i=0;i<K;i++){
        //     out[i] = points[distance[i][1]];
        // }
        // return out;

// Second Approach with MaxHeap o(n log n)
        // int[][] out = new int[K][2];
        // PriorityQueue<int[]> kClosest =
        //     new PriorityQueue<int[]>(K,(A,B)->(B[0] * B[0] + B[1] * B[1])-(A[0] * A[0] + A[1] * A[1]));
        // for(int i=0;i<points.length;i++){
        //     kClosest.offer(points[i]);
        //     if(kClosest.size() > K)
        //         kClosest.poll();
        // }
        // for(int i=0;i<K;i++)
        //     out[i] = kClosest.poll();
        // return out;

// Third approach with quick select and partition O(n)
        int L = 0,
            R = points.length-1,
            pIndex=0;

        while(L < R){
            pIndex = partition(points,L,R);
            if(pIndex == K-1)
                break;
            else if(pIndex > K)
                R = pIndex - 1;
            else
                L = pIndex + 1;
        }

        return Arrays.copyOfRange(points,0,K);
    }

    private int partition(int[][] points,int L, int R){
        int pivot = distance(points[R]);
        int pIndex = L;
        for(int i=L; i<R; i++)
            if(distance(points[i]) < pivot){
                swap(points,i,pIndex);
                pIndex++;
            }
        swap(points,pIndex,R);
        return pIndex;
    }

    private void swap(int[][] points,int i,int j){
        int[] temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }

    private int distance(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}
