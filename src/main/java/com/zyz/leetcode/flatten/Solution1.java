package com.zyz.leetcode.flatten;

import com.zyz.leetcode.TreeNode;

/**
 * Created by ZhangYuanzhuo on 2016/12/18.
 */
public class Solution1 {
    private TreeNode cur = null;

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        if (cur != null) {
            cur.left = null;
            cur.right = root;
        }
        cur = root;
        TreeNode right = root.right;
        flatten(root.left);
        flatten(right);
    }
}