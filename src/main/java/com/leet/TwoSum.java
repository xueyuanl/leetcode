package com.leet;

//1 Two Sum
public class TwoSum {

    public static void main(String [] args){

        TwoSum twoSum = new TwoSum();
        int nums[] = {2,7,11,15};
        twoSum.twoSum(nums, 9);

    }


    public int[] twoSum(int[] nums, int target) {

        int result [] = new int[2];

        lable:
        for(int i = 0;i < nums.length;i ++){
            for(int j = i + 1; j < nums.length; j ++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break  lable;
                }
            }
        }

        return result;
    }
}
