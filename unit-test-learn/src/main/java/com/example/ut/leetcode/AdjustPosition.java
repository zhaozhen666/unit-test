package com.example.ut.leetcode;

import java.util.Arrays;

/**
 * @description: 调整数组位置
 * @author: zhaozhen
 * @create: 2023/04/19 07:14
 */
public class AdjustPosition {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5,6};
        adjustPosition(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void adjustPosition(int [] arrays){
        int length = arrays.length;
        if (length<2){
            return;
        }

        int i =length-1;
        int j = 0;
        int temp=0;
        while (i>j){
            if ((arrays[i] &1) ==0){
                i--;
                continue;
            }

            if ((arrays[j] &1)==1){
                j++;
                continue;
            }

            temp = arrays[i];
            arrays[i] =arrays[j];
            arrays[j] = temp;
            i--;
            j++;
        }
    }
}
