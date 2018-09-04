package com.leet;

public class MedianofTwoSortedArrays {


    public static void main(String[] args) {
        MedianofTwoSortedArrays m = new MedianofTwoSortedArrays();


        double d = m.findMedianSortedArrays(new int[]{}, new int[]{1});
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int length = nums1.length + nums2.length;

        int[] nums = new int[length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            nums[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            nums[k++] = nums2[j++];
        }
        int mid = (length - 1) / 2;

        if (length % 2 == 0) {
            return (double) ((nums[mid] + nums[mid + 1]) / 2.0);
        } else {
            return (double) (nums[mid]);
        }


    }


}
