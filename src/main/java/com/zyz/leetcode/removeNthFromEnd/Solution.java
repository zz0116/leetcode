package com.zyz.leetcode.removeNthFromEnd;

import com.zyz.leetcode.ListNode;

/**
 * Created by ZhangYuanzhuo on 2016/10/1.
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        if (len == 1) {
            return null;
        }

        /*顺数角标为index*/
        int index = len - n;

        /*删除节点*/
        if (index == 0) {
            return head.next;
        }
        ListNode prev = head;
        while (--index != 0) {
            prev = prev.next;
        }
        ListNode del = prev.next;
        prev.next = del.next;


        return head;
    }
}
