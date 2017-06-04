package com.zyz.leetcode.reorderList;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2017/6/4.
 */
public class Solution {
    public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        if (head == null) {
            return;
        }
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            list.get(i).next = list.get(j);
            list.get(j).next = list.get(i + 1);
        }
        list.get(list.size() / 2).next = null;
    }
}