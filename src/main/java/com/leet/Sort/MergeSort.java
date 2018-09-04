package com.leet.Sort;

//basic algorithm implement, not a leet problem
public class MergeSort {


    public static void main(String[] args) {

        MergeSort m = new MergeSort();

        int[] arr = {1, 9, 4, 2, 5, 6};

        m.sort(arr);
    }


    public void sort(int[] nums) {

        int[] temp = new int[nums.length]; //

        sort(nums, 0, nums.length - 1, temp);

    }


    private void sort(int[] nums, int l, int r, int[] temp) {

        if (!(l < r)) return; // critical step

        int m = (l + r) / 2;

        sort(nums, l, m, temp);
        sort(nums, m + 1, r, temp);

        merge(nums, l, m + 1, r, temp);
    }

    private void merge(int[] nums, int l, int m, int r, int[] temp) {

        int i = l;
        int j = m;
        int t = l;

        while (i < m && j <= r) {

            if (nums[i] < nums[j]) {
                temp[t++] = nums[i++];
            } else {
                temp[t++] = nums[j++];
            }
        }

        while (i < m) {
            temp[t++] = nums[i++];
        }

        while (j <= r) {
            temp[t++] = nums[j++];
        }

        while (l <= r) {
            nums[l] = temp[l];
            l++;
        }

    }


}
