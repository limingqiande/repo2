package com.test.java;

public class test1 {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i=0; i<ints.length; i++){
            System.out.println(ints[i]);
        }
    }
}


class Solution{

    public int[] twoSum(int[] nums , int target){
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (target - nums[i] == nums[j]){
                    return new int[]{i , j};
                }
            }
        }
        return null;
    }
}