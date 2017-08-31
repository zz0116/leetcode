package com.zyz.leetcode.removeElements;

import com.zyz.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2017/6/13.
 */
public class SolutionTest {
    @Test
    public void removeElements() throws Exception {
        Solution solution = new Solution();

        ListNode root = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        root.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        System.out.println(solution.removeElements(root, 6));
    }

}