package com.zyz.leetcode.isValidBST;

/**
 * Created by ZhangYuanzhuo on 2016/11/16.
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long left, long right) {
        if (root == null)
            return true;
        if (root.val >= right || root.val <= left)
            return false;
        return helper(root.left, left, root.val) && helper(root.right, root.val, right);
    }
}