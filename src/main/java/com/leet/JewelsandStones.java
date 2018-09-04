package com.leet;

import java.util.ArrayList;
import java.util.List;

public class JewelsandStones {


    public static void main(String[] args){

        int [] a = new int[] {1,2,3};
        changeToNull(a);

        System.out.println(a);

    }

    private static void changeToNull(int [] b){

        System.out.println(b);
        b = new int[]{};
        System.out.println(b);
    }


    public int numJewelsInStones(String J, String S) {

        int[] judge = new int[200];
        for (int i = 0; i < J.length(); i++) {
            judge[J.charAt(i)] = 1;
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (judge[S.charAt(i)] == 1) {

                count++;
            }
        }
        return count;
    }


}