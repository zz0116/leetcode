package com.zyz.leetcode;

/**
 * Created by ZhangYuanzhuo on 2016/11/14.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * 由二叉树的先序遍历数组还原二叉树
     * @param nums
     * @return
     */
    public static TreeNode createTreeFromArray(Integer[] nums) {
        return createTreeFromArray(nums, 0);
    }

    private static TreeNode createTreeFromArray(Integer[] nums, int index) {
        TreeNode tn = null;
        Integer num;
        if (index < nums.length && null != (num = nums[index])) {
            tn = new TreeNode(num);
            tn.left = createTreeFromArray(nums, index * 2 + 1);
            tn.right = createTreeFromArray(nums, index * 2 + 2);
        }
        return tn;
    }
}