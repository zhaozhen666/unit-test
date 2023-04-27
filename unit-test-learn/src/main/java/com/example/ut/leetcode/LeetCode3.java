package com.example.ut.leetcode;

/**
 * @description: 最长子串
 * @author: zhaozhen
 * @create: 2023/04/27 22:18
 */
public class LeetCode3 {

    public static void main(String[] args) {
        String s= "pwwkew";
//        int [] arr = new int[256];
//        System.out.println(arr[s.charAt(0)]++);
//        System.out.println(arr['p']++);
//        System.out.println(longestSonStr(s));

        lengthOfLongestSubstring(s);

    }

    public static int longestSonStr(String s){
        if (s==null || s.length()<1){
            return 0;
        }

        int [] arr = new int[256];
        int l =0;
        int r =0;
        int res = 0;
        while (l<s.length()){
            if (r<s.length() && arr[s.charAt(r)]==0){
                arr[s.charAt(r++)]++;
                res = Math.max(res,r-l);
            }else {
                arr[s.charAt(l++)]--;
            }
        }

        return res;
    }

    public static  int lengthOfLongestSubstring(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
