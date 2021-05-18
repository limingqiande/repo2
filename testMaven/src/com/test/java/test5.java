package com.test.java;

import static java.lang.Integer.parseInt;

public class test5 {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        System.out.println(solution.reverse(-123));
    }
}

class Solution5 {

    public int reverse(int x) {
        if(x == 0){
            return 0;
        }

        if(x<0){
            x = x * (-1);
        }

        String s = String.valueOf(x);
        String reverse = "";
        for(int i=s.length()-1; i>=0; i--){
            reverse += s.charAt(i);
        }
        Integer res = parseInt(reverse);
        return res;
    }
}
