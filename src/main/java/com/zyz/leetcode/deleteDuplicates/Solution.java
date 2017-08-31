package com.zyz.leetcode.deleteDuplicates;

import com.zyz.leetcode.ListNode;

/**
 * Created by ZhangYuanzhuo on 2016/11/9.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode temp = res;
        if (head == null) {
            return null;
        }
        while (head.next != null) {
            if (head.next.val != head.val) {
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;
        }
        temp.next = head;
        return res.next;
    }
}