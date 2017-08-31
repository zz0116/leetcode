package com.zyz.leetcode.sortedArrayToBST;

import com.zyz.leetcode.TreeNode;

/**
 * Created by ZhangYuanzhuo on 2016/12/8.
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = nums.length;
        if (l == 0)
            return null;
        TreeNode res = new TreeNode(nums[(l - 1) / 2]);
        helper(nums, res, 0, l, (l - 1) / 2);
        return res;
    }

    private void helper(int[] nums, TreeNode t, int left, int right, int key) {
        if (left >= right)
            return;
        if (left < key) {
            t.left = new TreeNode(nums[(key + left - 1) / 2]);
            helper(nums, t.left, left, key, (key + left - 1) / 2);
        }
        if (key + 1 < right) {
            t.right = new TreeNode(nums[(key + right) / 2]);
            helper(nums, t.right, key + 1, right, (key + right) / 2);
        }
    }
}