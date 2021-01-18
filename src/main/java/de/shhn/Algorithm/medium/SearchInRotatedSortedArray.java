package de.shhn.Algorithm.medium;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int mid, result = -1, left = 0, right = nums.length-1;

        while(left<=right){
            mid = (left + right) / 2;

            if(nums[mid] == target){
                result = mid;
                break;
            }

            // left is sorted
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && nums[mid] >= target )
                    right = mid - 1;
                else
                    left = mid + 1;
            }else{
                // right is sorted
                if(nums[mid] <= target && nums[right] >= target )
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return result;
    }
}

