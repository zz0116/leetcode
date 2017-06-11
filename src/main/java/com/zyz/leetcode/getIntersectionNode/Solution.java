package com.zyz.leetcode.getIntersectionNode;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2017/6/11.
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*
        * 官方最佳
        * */
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;

//        自己解答
//        ArrayList<ListNode> list = new ArrayList<>();
//        while (headA != null) {
//            list.add(headA);
//            headA = headA.next;
//        }
//        while (headB != null) {
//            if (list.contains(headB)) {
//                return headB;
//            }
//            headB = headB.next;
//        }
//        return null;
    }
}