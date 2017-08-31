package com.zyz.leetcode.constructMaximumBinaryTree;

import com.zyz.leetcode.TreeNode;

/**
 * @author Zhang Yuanzhuo.
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int iom = indexOfMax(nums);
        TreeNode root = new TreeNode(nums[iom]);

        int[] leftSubtree = new int[iom];
        System.arraycopy(nums, 0, leftSubtree, 0, iom);

        int[] rightSubtree = new int[nums.length - iom - 1];
        System.arraycopy(nums, iom + 1, rightSubtree, 0, nums.length - iom - 1);

        root.left = constructMaximumBinaryTree(leftSubtree);
        root.right = constructMaximumBinaryTree(rightSubtree);
        return root;
    }

    public int indexOfMax(int[] nums) {
        int ret = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                ret = i;
            }
        }
        return ret;
    }
}