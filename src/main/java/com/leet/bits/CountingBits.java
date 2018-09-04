package com.leet.bits;

public class CountingBits {

    public static void main(String[] args){

        CountingBits c = new CountingBits();
        int[] nums = c.countBits(5);

    }


    public int[] countBits(int num) {

        int[] bits = new int[num + 1];

        for(int i = 0; i <= num; i ++){

            bits[i] = countBit(i);
        }

        return bits;

    }

    private int countBit(int n){

        int count = 0 ;
        while(n > 0){
            if((n & 1) == 1){
                count ++;
            }

            n >>= 1;
        }
        return count;
    }


}
