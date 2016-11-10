package com.zyz.leetcode.partition;

/**
 * Created by ZhangYuanzhuo on 2016/11/9.
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode sHead = new ListNode(0);
        ListNode lHead = new ListNode(0);
        ListNode small = sHead;
        ListNode large = lHead;
        if (head == null || head.next == null) {
            return head;
        }
        while (head.next != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        if (head.val < x) {
            small.next = head;
            small = small.next;
        } else {
            large.next = head;
            large = large.next;
        }
        large.next = null;

        small.next = lHead.next;
        return sHead.next;
    }
}