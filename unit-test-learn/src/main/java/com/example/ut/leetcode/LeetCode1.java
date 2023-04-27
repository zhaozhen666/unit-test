package com.example.ut.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 两数之和
 * @author: zhaozhen
 * @create: 2023/04/27 22:06
 */
public class LeetCode1 {


    public static void main(String[] args) {

        int[] sums = new int[]{2,7,11,15};
        System.out.println(twoSum(sums, 9)[0]);
        System.out.println(twoSum(sums, 9)[1]);
    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);
        }

        return null;
    }
}
