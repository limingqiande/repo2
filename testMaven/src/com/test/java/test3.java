package com.test.java;

public class test3 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String result = solution.longestPalindrome("babad");
        System.out.println(result);
    }

}

class Solution1 {

    public String longestPalindrome(String s) {

        String res = "";

        if (s == null || s.length() == 0){
            return "";
        }

        for (int i=0; i<s.length(); i++){
            for (int j=s.length()-1; j>=0; j--){
                String temp = s.substring(i , j+1);
                if (huiwen(temp)){
                    if(temp.length() > res.length()){
                        res = temp;
                    }
                    break;
                }
            }
        }
        return res;
    }

    public static boolean huiwen(String temp){
        for (int i=0,j=temp.length()-1; i<=j; i++,j--){
            if (temp.charAt(i) != temp.charAt(j)){
                return false;
            }
        }
        return true;
    }
}


