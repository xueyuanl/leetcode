package com.leet;

public class FindtheDuplicateNumber {

    public static void main(String[] args){



        FindtheDuplicateNumber f = new FindtheDuplicateNumber();

        int[] nums = {1,3,4,2,2};

        f.findDuplicate(nums);
    }



    public int findDuplicate(int[] nums) {

        MergeSort m = new MergeSort();

        int[] temp = new int[nums.length];
        for (int i = 0; i <nums.length; i ++) {
            temp[i] = nums[i];
        }

        m.sort(nums);

        int r = 0;
        for (int i = 1; i <nums.length; i ++) {
            if(nums[i] == nums[i - 1]){
                r = nums[i];
                break;
            }
        }

        for (int i = 0; i <nums.length; i ++) {
            nums[i] = temp[i];
        }

        return r;

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

}
