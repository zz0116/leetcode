package com.zyz.leetcode.sumNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/12/29.
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        return helper(root, 0);
    }

    private int helper(TreeNode t, int sum) {
        if (t == null) {
            return sum;
        }
        if (t.left == null) {
            return helper(t.right, sum * 10 + t.val);
        } else if (t.right == null) {
            return helper(t.left, sum * 10 + t.val);
        }
        return helper(t.left, sum * 10 + t.val) + helper(t.right, sum * 10 + t.val);
    }
}