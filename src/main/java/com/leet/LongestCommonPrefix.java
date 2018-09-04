package com.leet;

public class LongestCommonPrefix {


    public static void main(String [] args){

        LongestCommonPrefix l = new LongestCommonPrefix();
        String [] strs = {"aca", "cba"};
        l.longestCommonPrefix(strs);
    }




    public String longestCommonPrefix(String[] strs) {



        StringBuffer result = new StringBuffer();


        int len = strs.length;

        if (len == 0) {
            return result.toString();
        }

        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            if (strs[i].length() < minLen) {
                minLen = strs[i].length();
            }
        }

        for (int i = 0; i < minLen; i++) {
            int count = 1;
            char first_word = strs[0].charAt(i);
            for (int j = 1; j < len; j++) {
                char at = strs[j].charAt(i);
                if (at == first_word){
                    count ++;
                }
            }

            if(count == len){
                result.append(first_word);
            }else{
                break;
            }
        }


        return result.toString();
    }

}