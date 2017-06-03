package com.zyz.leetcode.hasCycle;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2017/6/3.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
        * 对倒是对了，不过感觉很浪费空间
        * 最坏的情况把所有的链表单元都存进了数组
        * 而且contains()方法应该是每次都把数组遍历了一遍
        * 时间上也有很多重复计算
        * */
//        if (head == null) {
//            return false;
//        }
//        ListNode p = head.next;
//
//        ArrayList<ListNode> list = new ArrayList<>();
//        list.add(head);
//
//        while (p != null) {
//            if (list.contains(p)) {
//                return true;
//            }
//            list.add(p);
//            p = p.next;
//        }
//        return false;

        /*
        * 推荐解法排名第一
        * */
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
