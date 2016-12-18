package com.zyz.leetcode.flatten;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2016/12/15.
 */
public class Solution {
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, list);
        construct(root, list);
    }

    private void construct(TreeNode t, ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            t.left = null;
            t.right = new TreeNode(list.get(i));
            t = t.right;
        }
    }

    private void helper(TreeNode t, ArrayList<Integer> list) {
        list.add(t.val);
        if (t.left != null) {
            helper(t.left, list);
            return;
        }
        if (t.right != null) {
            helper(t.right, list);
        }
    }
}