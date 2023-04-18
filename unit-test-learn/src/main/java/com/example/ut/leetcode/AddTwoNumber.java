package com.example.ut.leetcode;

/**
 * @description: 两数相加
 * @author: zhaozhen
 * @create: 2023/04/11 11:09
 */
public class AddTwoNumber {


       public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next;}
      }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           ListNode p =l1,q =l2;
           ListNode resultHead = new ListNode(-1);
           ListNode cur = resultHead;
           int carry = 0;
           while (p!=null ||p!=null){
               int x= p!=null?p.val:0;
               int y = q!=null?q.val:0;
               int sum = x+y+carry;
               carry =sum/10;
               sum = sum%10;
               cur.next = new ListNode(sum);
               cur =cur.next;

               p= p==null?p:p.next;
               q= q==null?q:q.next;
           }

           if (carry>0){
               cur.next = new ListNode(carry);
           }
           return resultHead.next;
    }
}
