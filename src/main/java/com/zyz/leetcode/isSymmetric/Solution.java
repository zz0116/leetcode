package com.zyz.leetcode.isSymmetric;

import com.zyz.leetcode.TreeNode;

/**
 * Created by ZhangYuanzhuo on 2016/11/18.
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }

    private boolean helper(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (q == null || p == null)
            return false;
        if (p.val != q.val)
            return false;
        return helper(p.left, q.right) && helper(p.right, q.left);
    }
}