package com.zyz.leetcode.detectCycle;

import com.zyz.leetcode.ListNode;

/**
 * Created by ZhangYuanzhuo on 2017/6/3.
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode p = head.next;
//
//        ArrayList<ListNode> list = new ArrayList<>();
//        list.add(head);
//
//        while (p != null) {
//            if (list.contains(p)) {
//                return p;
//            }
//            list.add(p);
//            p = p.next;
//        }
//        return null;


        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }

        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
