package com.zyz.leetcode.inorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/11/14.
 */
public class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            helper(root);
        }
        return res;
    }

    private void helper(TreeNode p) {
        if (p.left != null) {
            helper(p.left);
        }
        res.add(p.val);
        if (p.right != null) {
            helper(p.right);
        }
    }
}