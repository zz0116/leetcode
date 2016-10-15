package com.zyz.leetcode.addTwoNumbers;

import org.junit.Test;

/**
 * Created by Zhang Yuanzhuo on 2016/9/30.
 */
public class SolutionTest {
    @Test
    public void addTwoNumbers() throws Exception {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(3);
        ListNode lSum = solution.addTwoNumbers(l1, l1);

        System.out.println((lSum.val + "," + lSum.next.val + "," + lSum.next.next.val + "," + lSum.next.next.next.val));
    }

}