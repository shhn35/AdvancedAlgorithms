package de.shhn.Algorithm.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumToZero {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        int prevElement = 0;
        int sum = 0, left = 0, right = 0;

        for(int i = 0;i<nums.length-2;i++){
            // For preventing duplicate results
            if(i>0 && nums[i] == prevElement)
                continue;

            left = i+1;
            right = nums.length-1;

            while(left < right){
                sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    // one match is found
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
                }

                if(sum <=0){
                    // a bigger element is needed to find a probable match

                    left++;
                    // For preventing duplicate results
                    while(left < nums.length && nums[left] == nums[left-1]) left++;
                }else if(sum > 0){
                    // a smaller element is needed to find a probable match
                    right--;
                    // For preventing duplicate results
                    while(right >=0 && nums[right] == nums[right+1]) right--;
                }

            }
            prevElement = nums[i];

        }
        return result;
    }
}
