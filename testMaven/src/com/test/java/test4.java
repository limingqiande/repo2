package com.test.java;

import java.util.HashMap;
import java.util.Map;

public class test4 {

    public static void main(String[] args) {
        int res = lengthOfLongestSubstring("abcdeeex");
        System.out.println(res);
    }




    public static int lengthOfLongestSubstring(String s){
        int fs = 0;//用于存取最后要返回的长度
        //1.创建一个map，key：字符，value: 字符下标
        Map<Character,Integer> map = new HashMap<>();
        //2.遍历字符串，并将字符串存入map中
        for (int start = 0,end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)){ //若已经存在于map中，则将其对应的value拿出来
                start = Math.max(map.get(ch),start);
            }
            // 取较大值
            fs = Math.max(fs,end - start +1);
            //存入map中
            map.put(ch,end + 1);
        }
        return fs;
    }


}
