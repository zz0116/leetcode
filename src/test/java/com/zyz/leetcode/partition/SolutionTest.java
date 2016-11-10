package com.zyz.leetcode.partition;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/11/10.
 */
public class SolutionTest {
    @Test
    public void partition() throws Exception {
        Solution solution = new Solution();
        ListNode n0 = new ListNode(1);
        ListNode n1 = new ListNode(4);
        n0.next = n1;
        ListNode n2 = new ListNode(3);
        n1.next = n2;
        ListNode n3 = new ListNode(2);
        n2.next = n3;
        ListNode n4 = new ListNode(5);
        n3.next = n4;
        ListNode n5 = new ListNode(1);
        n4.next = n5;
        System.out.println(solution.partition(n0, 3));
    }

}