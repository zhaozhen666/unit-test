package com.example.ut.leetcode;

import cn.hutool.core.lang.Tuple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @description:
 * @author: zhaozhen
 * @create: 2023/05/07 14:16
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(solution(249609));
    }

    public static boolean solution(int n) {
        String temp = Integer.toString(n);
        String temp2;
        int temp3;
        int [] newGuess = new int[temp.length()];
        for(int i=0; i<temp.length(); i++) {
            temp2 = temp.substring(i, i+1);
            temp3 =  Integer.parseInt(temp2);
            newGuess[i] = temp3;
        }
        Integer left =0;
        for(int i=0; i<newGuess.length/2; i++) {
            left =left+newGuess[i];
        }
        Integer right =0;
        for(int i=newGuess.length/2; i<newGuess.length; i++) {
            right = right+newGuess[i];
        }
        if (left==right){
            return true;
        }else {
            return false;
        }
    }
}
