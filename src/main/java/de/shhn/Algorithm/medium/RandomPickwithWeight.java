package de.shhn.Algorithm.medium;

import java.util.Random;

public class RandomPickwithWeight {
    int[] wAcc;
    Random rand = new Random();
    public RandomPickwithWeight(int[] w) {
        wAcc = new int[w.length];
        wAcc[0] = w[0];
        for (int i = 1;i<w.length;i++){
            wAcc[i] = wAcc[i-1] + w[i];
        }
    }

    public int pickIndex() {
        int left = 0;
        int right = wAcc.length - 1;
        int mid;
        //[1 max_sampling]
        int sample = rand.nextInt(wAcc[right]) + 1;
        while(left<right){
            mid = (left + right) / 2;
            if(wAcc[mid] == sample)
                return mid;
            else if(wAcc[mid] < sample)
                left = mid + 1;
            else if(wAcc[mid] > sample)
                right = mid;
        }
        return left;
    }
}
