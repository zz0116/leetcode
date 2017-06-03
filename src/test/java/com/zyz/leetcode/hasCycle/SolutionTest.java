package com.zyz.leetcode.hasCycle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2017/6/3.
 */
public class SolutionTest {
    @Test
    public void hasCycle() throws Exception {
        Solution solution = new Solution();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
//        head.next.next.next.next = head.next;
        System.out.println(solution.hasCycle(head));
    }

}