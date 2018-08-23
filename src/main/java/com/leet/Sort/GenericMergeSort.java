package com.emc.mystic.manager.operation.core.factory.leet.Sort;

import java.util.Comparator;

public class GenericMergeSort<T> {

    public static void main(String[] args) {

        GenericMergeSort g = new GenericMergeSort();

        Integer[] arr = {1, 9, 4, 2, 5, 6};

        g.sort( arr, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.intValue() < o2.intValue()){
                    return -1;
                }
                else if(o1.intValue() == o2.intValue()){
                    return 0;
                }
                else{
                    return 1;
                }
            }
        });

        System.out.println(arr);
    }

    public void sort(Object[] o, Comparator<T> comparator) {

        Object[] temp = new Object[o.length]; //

        sort(o, 0, o.length - 1, temp, comparator);


    }


    private void sort(Object[] nums, int l, int r, Object[] temp, Comparator<T> comparator) {

        if (!(l < r)) return; // critical step

        int m = (l + r) / 2;

        sort(nums, l, m, temp, comparator);
        sort(nums, m + 1, r, temp, comparator);

        merge(nums, l, m + 1, r, temp, comparator);
    }

    private void merge(Object[] nums, int l, int m, int r, Object[] temp, Comparator<T> comparator) {

        int i = l;
        int j = m;
        int t = l;

        while (i < m && j <= r) {

            if (comparator.compare((T) nums[i], (T) nums[j]) < 0) {
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