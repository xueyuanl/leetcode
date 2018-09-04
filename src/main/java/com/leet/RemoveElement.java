package com.leet;

//two index problem
public class RemoveElement {

    public static void main(String[] args) {


        RemoveElement r = new RemoveElement();

        int[] nums = new int[]{2};

        r.removeElement(nums, 3);

    }


    public int removeElement(int[] nums, int val) {

        if (nums.length == 0) {
            return 0;
        }

        int index_base = 0;
        int index_move = 0;

        int count = 0;

        while (index_move < nums.length) {

            while (index_base < nums.length && nums[index_base] != val) {
                index_base++;
                index_move++;
            }

            while (index_move < nums.length && nums[index_move] == val) {
                index_move++;
                count++;
            }

            if (index_move == nums.length) {
                break;
            }

            swap(nums, index_base, index_move);

            index_base++;
            index_move++;
        }

        return nums.length - count;
    }


    private void swap(int[] nums, int a, int b) {
        int x;
        x = nums[a];
        nums[a] = nums[b];
        nums[b] = x;
    }
}
