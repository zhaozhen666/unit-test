package com.example.ut.leetcode;

/**
 * @description: 有序数组中位数
 * @author: zhaozhen
 * @create: 2023/04/28 11:17
 */
public class LeetCode4 {
    public static void main(String[] args) {
        int [] nums1 = new int[]{1,3};
        int [] nums2 = new int[]{2};
        System.out.println(findMiddle(nums1,nums2));
    }

    public static double findMiddle(int [] nums1,int [] nums2){
        if (nums1.length>nums2.length){
            findMiddle(nums2,nums1);
        }
        int left = 0;
        int right = nums1.length;
        int halfLen = (nums1.length+nums2.length+1) >>1;
        while (left<=right){
            int i = (left+right)>>1;
            int j = halfLen-i;
            if (i<right && nums2[j-1]>nums1[i]){
                left++;
            }else if (i>left && nums1[i-1]>nums2[j]){
                right--;
            }else {
                int leftMax = (i==0)? nums2[j-i] :(j==0?nums1[i-1]:Math.max(nums1[i-1],nums2[j-1]));
                if (((nums1.length+nums2.length)&1)==1){
                    return leftMax*1.0;
                }
                int rightMin = (i==nums1.length)?nums2[j]:(j== nums2.length?nums1[i]:Math.min(nums1[i],nums2[j]));
                return leftMax+rightMin/2.0;
            }
        }
        return 0.0;
    }
}
