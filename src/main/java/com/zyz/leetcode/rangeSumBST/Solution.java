package com.zyz.leetcode.rangeSumBST;

import com.zyz.leetcode.TreeNode;

/**
 * 二叉树的各种遍历还不是很熟
 */
public class Solution {
    public int rangeSumBST(TreeNode root, int l, int r) {
        if (root == null) {
            return 0;
        }
        int sum = rangeSumBST(root.left, l, r) + rangeSumBST(root.right, l, r);
        int val = root.val;
        if (val >= l && val <= r) {
            sum += val;
        }
        return sum;
    }
}
