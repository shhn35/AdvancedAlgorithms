package de.shhn.Algorithm.medium;

import java.util.HashMap;
import java.util.Stack;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        int total = 0, sum = 0;
        HashMap<Integer,Integer> preSum = new HashMap<>();

        preSum.put(0,1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(preSum.containsKey(sum - k))
                total += preSum.get(sum - k);
            preSum.put(sum,preSum.getOrDefault(sum,0) + 1);
        }

        return total;



    }
}
