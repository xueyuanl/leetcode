package com.emc.mystic.manager.operation.core.factory.leet;

public class HammingDistance {


    public static void main(String[] args) {


        HammingDistance h = new HammingDistance();
        h.hammingDistance(1, 4);
    }

    public int hammingDistance(int x, int y) {

        int z = x ^ y;

        int count = 0;

        while (z > 0) {

            if ((z & 1) == 1) {
                count++;
            }
            z >>= 1;
        }

        return count;
    }

}