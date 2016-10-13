package com.zyz.leetcode.addTwoNumbers;

/**
 * Created by Zhang Yuanzhuo on 2016/9/30.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        int len = 0;
        while (l1Temp != null || l2Temp != null) {
            len++;
            if (l1Temp != null) {
                l1Temp = l1Temp.next;
            }
            if (l2Temp != null) {
                l2Temp = l2Temp.next;
            }
        }

        int i = len;
        ListNode lSumHead = new ListNode(0);

        ListNode lSumTail = lSumHead;
        ListNode l1Tail = l1;
        ListNode l2Tail = l2;

        while (i != 0) {
            i--;

            ListNode lSumTemp = new ListNode(0);

            lSumTail.next = lSumTemp;

            lSumTail.val += l1Tail.val + l2Tail.val;
            if (lSumTail.val > 9) {
                lSumTail.val -= 10;
                lSumTail.next.val = 1;
            }

            lSumTail = lSumTemp;
            if (l1Tail.next != null) {
                l1Tail = l1Tail.next;
            } else {
                l1Tail = new ListNode(0);
            }
            if (l2Tail.next != null) {
                l2Tail = l2Tail.next;
            } else {
                l2Tail = new ListNode(0);
            }
        }

        ListNode prev = lSumHead;
        ListNode lST = lSumHead.next;
        while (lST.next != null) {
            prev = prev.next;
            lST = lST.next;
        }
        if (prev.next.val == 0) {
            prev.next = null;
        }
        return lSumHead;
    }
}
