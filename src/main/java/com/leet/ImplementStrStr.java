package com.emc.mystic.manager.operation.core.factory.leet;

public class ImplementStrStr {


    public static void main(String[] args){

        ImplementStrStr i = new ImplementStrStr();
        i.strStr("hello","ll");

    }


    public int strStr(String haystack, String needle) {

        if(needle.isEmpty()){
            return 0;
        }

        int len_haystack = haystack.length();
        int len_needle = needle.length();

        //hello
        // ll
        int index = -1;

        for(int i = 0;i < len_haystack - len_needle + 1; i ++){
            for(int j = 0; j < len_needle; j ++){
                if(haystack.charAt(i+ j) != needle.charAt(j)){
                    break;
                }

                if(j == len_needle - 1){
                    index = i;
                }
            }
            if(index != -1){
                break;
            }
        }
        return index;
    }
}
