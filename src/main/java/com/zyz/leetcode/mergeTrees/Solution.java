package com.zyz.leetcode.mergeTrees;

import com.zyz.leetcode.TreeNode;

/**
 * @author Zhang Yuanzhuo.
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

//        if (t1 == null && t2 != null) {
//            t1 = new TreeNode(0);
//        }
//        if (t2 != null) {
//            t1.val += t2.val;
//            if (t1.left == null && t2.left != null) {
//                t1.left = new TreeNode(0);
//            }
//            if (t1.right == null && t2.right != null) {
//                t1.right = new TreeNode(0);
//            }
//            mergeTrees(t1.left, t2.left);
//            mergeTrees(t1.right, t2.right);
//        }

        return t1;
    }
}