package com.leet;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {


    public static void main(String [] args){
        ValidParentheses v = new ValidParentheses();

        v.isValid("{[]}");

    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (int i = 0; i < s.length(); i++) {

            if (stack.empty()) {
                stack.push(s.charAt(i));
                continue;
            }

            if (map.get(s.charAt(i)) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.empty()) {
            return true;
        } else return false;
    }


}
