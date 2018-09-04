package com.leet;

public class PalindromeNumber {


    public static void main(String[] args) {


        PalindromeNumber palindromeNumber = new PalindromeNumber();

        palindromeNumber.isPalindrome(10);

    }

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        int agentX = x;

        int convert = 0;

        while (agentX != 0) {
            int tail = agentX % 10;
            convert = convert * 10 + tail;
            agentX = agentX / 10;
        }

        if(convert == x){
            return true;
        }
        else return false;

    }


}
