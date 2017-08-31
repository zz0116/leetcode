package com.zyz.leetcode.isSameTree;

import com.zyz.leetcode.TreeNode;

/**
 * Created by ZhangYuanzhuo on 2016/11/17.
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}