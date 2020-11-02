package de.shhn.Algorithm.easy;

import java.util.HashMap;
import java.util.Map;

/*
Problem Description:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Source: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] findTwoSum(int[] nums, int target){
        Map<Integer,Integer> pairs = new HashMap<Integer, Integer>();
        int diff = 0;
        for(int i=0; i<nums.length;i++){
            if(pairs.containsKey(nums[i]))
                return new int[]{pairs.get(nums[i]),i};

            diff = target - nums[i];
            pairs.put(diff, i);
        }
        return new int[]{-1,-1};
    }
}
