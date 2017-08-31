package com.zyz.leetcode.deleteDuplicates2;

import com.zyz.leetcode.ListNode;

/**
 * Created by ZhangYuanzhuo on 2016/11/8.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int existed = 1;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode temp = res;
        if (head == null) {
            return null;
        }
        while (head.next != null) {
            if (head.next.val == head.val) {
                existed++;
            } else {
                if (existed == 1) {
                    temp.next = head;
                    temp = temp.next;
                } else {
                    existed = 1;
                }
            }
            head = head.next;
        }
        if (existed == 1) {
            temp.next = head;
        } else {
            temp.next = null;
        }
        return res.next;
    }
}