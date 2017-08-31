package com.zyz.leetcode.mergeTwoLists;

import com.zyz.leetcode.ListNode;
import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/10/8.
 */
public class SolutionTest {
    @Test
    public void mergeTwoLists() throws Exception {
        Solution solution = new Solution();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

//        ListNode l1 = new ListNode(2);
//        ListNode l2 = new ListNode(1);

        ListNode l3 = new ListNode(0);
        l3.next = new ListNode(1);
        ListNode l4 = new ListNode(0);
        l4.next = new ListNode(3);
        l4.next.next = new ListNode(2);

//        solution.mergeTwoLists(null, null).toString();
        System.out.println(solution.mergeTwoLists(l1, l2).next.val);
//        System.out.println(solution.mergeTwoLists(l3, l4).next.next.val);
//        System.out.println(solution.mergeTwoLists(l3, l4).next.next.next.next.val);
    }

}