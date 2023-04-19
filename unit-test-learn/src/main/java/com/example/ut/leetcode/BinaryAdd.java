//package com.example.ut.leetcode;
//
///**
// * @description: binary
// * @author: zhaozhen
// * @create: 2023/04/11 13:43
// */
//public class BinaryAdd {
//
//
//    public static void main(String[] args) {
//
//    }
//
//
//    public static String binaryAdd(String a,String b){
//        int i = a.length()-1,j =b.length()-1,carry=0;
//        StringBuilder str = new StringBuilder();
//        while (carry==1 || i>=0 ||j>=0){
//            if (i>=0 && a.charAt(i--)=='1'){
//                carry++;
//            }
//            if (j>=0 &&b.charAt(j--)=='1'){
//                carry++;
//            }
//            str.append(carry%2);
//            carry = carry/2;
//        }
//        return str.reverse().toString();
//    }
//
//
//    int i = a.length() - 1, j = b.length() - 1, carry = 0;
//    StringBuilder str = new StringBuilder();
//			while (carry == 1 || i >= 0 || j >= 0) {
//        if (i >= 0 && a.charAt(i--) == '1') {
//            carry++;
//        }
//        if (j >= 0 && b.charAt(j--) == '1') {
//            carry++;
//        }
//        str.append(carry % 2);
//        carry /= 2;
//    }
//			return str.reverse().toString();
//}
