package com.zyz.leetcode.rotateRight;

import com.zyz.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/10/29.
 */
public class SolutionTest {
    @Test
    public void rotateRight() throws Exception {
        Solution solution = new Solution();
//        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(3);
//        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode res =  solution.rotateRight(n2, 1);
        while(res!=null) {
            System.out.print(res.val+" ");
            res = res.next;
        }
    }

}