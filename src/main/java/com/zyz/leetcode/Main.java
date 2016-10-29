package com.zyz.leetcode;

public class Main {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode n0 = n1;
        int len = 0;
        while(n0!=null) {
            len++;
            n0 = n0.next;
        }
        System.out.println(len);
//        n0 = n1;

        int n = 0;

        ListNode nn = n1;
        while(n-->0) {
            nn = nn.next;
        }

        while(len-->0) {
            System.out.print(nn.val+" ");
            nn = nn.next;
        }
    }
}
