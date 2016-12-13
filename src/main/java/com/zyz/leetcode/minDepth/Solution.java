package com.zyz.leetcode.minDepth;

/**
 * Created by ZhangYuanzhuo on 2016/12/13.
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        else
            return helper(root.left, root.right);
    }

    private int helper(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return 1;
        else if (left != null && right == null)
            return helper(left.left, left.right) + 1;
        else if (left == null && right != null)
            return helper(right.left, right.right) + 1;
        else return Math.min(helper(left.left, left.right) + 1, helper(right.left, right.right) + 1);
    }
}