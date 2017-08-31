package com.zyz.leetcode.removeElements;

import com.zyz.leetcode.ListNode;

/**
 * Created by ZhangYuanzhuo on 2017/6/13.
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode lead = new ListNode(0);
        lead.next = head;

        ListNode pre = lead;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return lead.next;
    }
}