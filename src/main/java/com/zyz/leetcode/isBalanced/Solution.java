package com.zyz.leetcode.isBalanced;

import com.zyz.leetcode.TreeNode;

/**
 * Created by ZhangYuanzhuo on 2016/12/13.
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(depth(root.left) - depth(root.right)) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode t) {
        if (t == null)
            return 0;
        return 1 + Math.max(depth(t.left), depth(t.right));
    }
}