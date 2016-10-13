package com.zyz.leetcode.swapPairs;

/**
 * Created by ZhangYuanzhuo on 2016/10/10.
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode tail = head;
        if (tail == null) {
            return null;
        }
        if (tail.next == null) {
            return head;
        }
        while (tail != null && tail.next != null) {
            int temp;
            temp = tail.val;
            tail.val = tail.next.val;
            tail.next.val = temp;

            tail = tail.next.next;
        }
        return head;
    }
}