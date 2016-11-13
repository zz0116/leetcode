package com.zyz.leetcode.reverseBetween;

/**
 * Created by ZhangYuanzhuo on 2016/11/13.
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode pre = res;
        ListNode cur = head;
        for (int i = 1; i < m; i++) {
            pre = cur;
            cur = cur.next;
        }
        ListNode p1 = null;
        ListNode p2 = null;
        if (cur != null) {
            p1 = cur.next;
        }
        if (p1 != null) {
            p2 = p1.next;
        }
        for (int i = m; i < n; i++) {
            p1.next = cur;
            cur = p1;
            p1 = p2;
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        pre.next.next = p1;
        pre.next = cur;
        return res.next;
    }
}