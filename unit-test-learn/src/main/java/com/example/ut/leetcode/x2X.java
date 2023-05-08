package com.example.ut.leetcode;

/**
 * @description: 小写转大写
 * @author: zhaozhen
 * @create: 2023/05/06 19:37
 */
public class x2X {
    public static void main(String[] args) {
        String str = "33258483";
        String xStr = "零壹贰叁肆伍陆柒捌玖";
        for (int i=0;i<str.length();i++){
            String a = String.valueOf(str.charAt(i));
            int b = Integer.parseInt(a);
            String x = String.valueOf(xStr.charAt(b));
            str = str.replaceFirst(a,x);
        }

        System.out.println(str);
    }
}
