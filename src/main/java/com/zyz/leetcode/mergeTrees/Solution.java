package com.zyz.leetcode.mergeTrees;

import com.zyz.leetcode.TreeNode;

/**
 * @author Zhang Yuanzhuo.
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        helper(t1, t2);

        if (t2 == null) {
            return null;
        } else {
            t1.val += t2.val;
        }

        mergeTrees(t1.left == null? t1.left = new TreeNode(0): t1.left, t2.left);
        mergeTrees(t1.right == null? t1.right = new TreeNode(0): t1.right, t2.right);

        return t1;
    }

    private void helper(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return;
        }
        if (t1.left != null && t2.left != null) {
            t1.left.val += t2.left.val;
        } else if (t1.left == null && t2.left != null) {
            t1.left = new TreeNode(t2.left.val);
        }
        if (t1.right != null && t2.right != null) {
            t1.right.val += t2.right.val;
        } else if (t1.right == null && t2.right != null) {
            t1.right = new TreeNode(t2.right.val);
        }
        mergeTrees(t1.left, t2.left);
        mergeTrees(t1.right, t2.right);
    }
}