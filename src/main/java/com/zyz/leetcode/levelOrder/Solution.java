package com.zyz.leetcode.levelOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/11/19.
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, 0);
        return res;
    }

    private void helper(TreeNode p, int depth) {
        if (p != null)

    }
}