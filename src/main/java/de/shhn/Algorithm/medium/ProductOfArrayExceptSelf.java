package de.shhn.Algorithm.medium;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
// O(1) memory space complexity
        int right =1;
        int[] out = new int[nums.length];

        out[0] = 1;
        for(int i=1;i<nums.length;i++){
            out[i] = out[i-1] * nums[i-1];
        }

        for(int i=nums.length-1;i>0;i--){
            out[i] = out[i] * right;
            right = right * nums[i];
        }
        out[0] = right;

        return out;

// O(n) memory space compxity
//         int len = nums.length;
//         int[] leftP = new int[len];
//         int[] rightP = new int[len];
//         int[] out= new int[len];

//         for(int i=0; i<len;i++){
//             if(i == 0){
//                 leftP[i] = 1;
//                 rightP[len - i - 1] = 1;
//             }else{
//                 leftP[i] = leftP[i-1] * nums[i-1];
//                 rightP[len-i-1] = rightP[len - i] * nums[len - i];
//             }
//         }

//         for(int i=0;i<len;i++){
//             out[i] = leftP[i] * rightP[i];
//         }

//         return out;
    }
}
