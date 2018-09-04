package com.leet.DP;


//DP
public class MaximumSubarray {


    public static void main(String[] args) {

        MaximumSubarray m = new MaximumSubarray();

        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        m.maxSubArray(array);


    }


    public int maxSubArray(int[] nums) {

        int current = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            current = Math.max(nums[i], current + nums[i]); //new or adding the past
            result = Math.max(current, result);
        }

        return result;
    }
}