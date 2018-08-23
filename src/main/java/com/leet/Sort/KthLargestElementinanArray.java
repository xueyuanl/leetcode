package com.emc.mystic.manager.operation.core.factory.leet.Sort;

public class KthLargestElementinanArray {


    public static void main(String[] args){

        KthLargestElementinanArray k = new KthLargestElementinanArray();

        int[] nums = {3,2,1,5,6,4};
        k.findKthLargest(nums,2);
    }


    public int findKthLargest(int[] nums, int k) {



        MergeSort m = new MergeSort();

        m.sort(nums);



        return nums[k-1];
    }



    class MergeSort {

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

                if (nums[i] > nums[j]) {
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

}
