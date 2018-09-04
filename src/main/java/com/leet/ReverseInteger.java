package com.leet;

public class ReverseInteger {

    public static void main(String[] args) {


        ReverseInteger reverseInteger = new ReverseInteger();

        reverseInteger.reverse(1534232469);

    }


    public int reverse(int x) {

        if (x == 0) {
            return 0;
        }


        if(x > 2147483647 || x < -2147483648 ){
            return 0;
        }

        int agentX = 0;
        if (x < 0) {
            agentX = x * -1;
        } else {
            agentX = x;
        }

        long newR = 0;

        while (agentX != 0) {
            int tail = agentX % 10;

            newR = newR * 10 + tail;
            agentX = agentX / 10;

        }

        if(newR > 2147483647 || newR < -2147483648 ){
            return 0;
        }



        if (x < 0) {
            return (int) newR * -1;
        } else {
            return (int) newR;
        }
    }
}