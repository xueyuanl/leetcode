package com.leet;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {

        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();



        int [] nums = new int[] {1,1,1,2,2,3,3};

        r.removeDuplicates(nums);

    }


    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int count = 1;

        int index = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[index]) {
                nums[index + 1] = nums[i];
                index ++;
                count++;
            }
        }

        return count;


    }
}
