package com.zyz.leetcode.copyRandomList;

import com.zyz.leetcode.RandomListNode;

/**
 * Created by ZhangYuanzhuo on 2017/5/21.
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }

        RandomListNode tmp;

        RandomListNode p = head;
        while (p != null) {
            tmp = p.next;
            p.next = new RandomListNode(p.label);
            p.next.next = tmp;
            p = p.next.next;
        }

        p = head;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }

        RandomListNode res = head.next;

        p = head;
        while (p != null) {
            tmp = p.next;
            p.next = p.next.next;
            if (p.next != null) {
                tmp.next = p.next.next;
            }
            p = p.next;
        }

        return res;
    }
}