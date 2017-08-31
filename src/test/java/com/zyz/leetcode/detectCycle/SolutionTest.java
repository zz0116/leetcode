package com.zyz.leetcode.detectCycle;

import com.zyz.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2017/6/3.
 */
public class SolutionTest {
    @Test
    public void detectCycle() throws Exception {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        head.next = head;
        System.out.println(solution.detectCycle(head));
    }

}