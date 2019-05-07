package com.zyz.leetcode.bstToGst;

import com.zyz.leetcode.TreeNode;

/**
 * @author 张远卓
 * @date 2019/5/7
 */
public class Solution {
    private int pre = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) bstToGst(root.right);
        pre = root.val = pre + root.val;
        if (root.left != null) bstToGst(root.left);
        return root;
    }
}
