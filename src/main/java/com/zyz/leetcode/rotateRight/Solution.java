package com.zyz.leetcode.rotateRight;

import com.zyz.leetcode.ListNode;

/**
 * Created by ZhangYuanzhuo on 2016/10/28.
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode res;
        if(head==null) {
            return null;
        }
        ListNode tail = head;
        int len = 1;
        while(tail.next!=null) {
            len++;
            tail = tail.next;
        }
        tail.next = head;
        k = len - k%len;
        while(k-->0) {
            head = head.next;
        }
        res = head;
        while(len-->1) {
            head = head.next;
        }
        head.next = null;
        return res;
    }
}