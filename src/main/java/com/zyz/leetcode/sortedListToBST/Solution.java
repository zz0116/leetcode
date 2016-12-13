package com.zyz.leetcode.sortedListToBST;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2016/12/11.
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int l = list.size();
        if (l == 0)
            return null;
        TreeNode res = new TreeNode(list.get((l - 1) / 2));
        helper(list, res, 0, l, (l - 1) / 2);
        return res;
    }

    private void helper(ArrayList<Integer> list, TreeNode t, int left, int right, int key) {
        if (left >= right)
            return;
        if (left < key) {
            t.left = new TreeNode(list.get((key + left - 1) / 2));
            helper(list, t.left, left, key, (key + left - 1) / 2);
        }
        if (key + 1 < right) {
            t.right = new TreeNode(list.get((key + right) / 2));
            helper(list, t.right, key + 1, right, (key + right) / 2);
        }
    }
}