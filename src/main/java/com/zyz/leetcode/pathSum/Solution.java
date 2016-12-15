package com.zyz.leetcode.pathSum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/12/14.
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        if (root == null)
            return res;
        else
            item.add(root.val);
        helper(root, sum - root.val, item, res);
        return res;
    }

    private void helper(TreeNode t, int remain, List<Integer> item, List<List<Integer>> res) {
        if (t.left == null && t.right == null && remain == 0) {
            res.add(new ArrayList<>(item));
            return;
        }
        if (t.left != null) {
            item.add(t.left.val);
            helper(t.left, remain - t.left.val, item, res);
            item.remove(item.size() - 1);
        }
        if (t.right != null) {
            item.add(t.right.val);
            helper(t.right, remain - t.right.val, item, res);
            item.remove(item.size() - 1);
        }
    }
}