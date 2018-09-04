package com.leet;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {


    public static void main(String[] args){

        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        l.lengthOfLongestSubstring("bbbbb");
    }


    public int lengthOfLongestSubstring(String s) {

        char[] ss = s.toCharArray();

        if(ss.length == 0){
            return 0;
        }

        int base = 0;
        int move = 0;

        int max = 0;

        Set<Character> set = new HashSet<>();

        int temp = 0;
        while(move != ss.length){

            if(set.contains(ss[move])){
                max = ((move - base) > max) ? (move - base): max;
                base ++;
                move = base;
                set.clear();
                set.add(ss[base]);
                temp = 1;
            }
            else {
                set.add(ss[move]);
                temp ++;
                max = temp > max ? temp: max;
            }

            move ++;
        }
        return max;
    }



}
