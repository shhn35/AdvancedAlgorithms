package de.shhn.Algorithm.easy;

public class ArrayRemoveDuplicate {
    public int removeDuplicate(int[] nums) {
        if(nums.length == 0)
            return 0;

        int index = 1,pointer = 1;

        while(pointer < nums.length){
            if(nums[pointer] == nums[index-1])
                pointer++;
            else
                nums[index++] = nums[pointer++];
        }

        return index;
    }
}
