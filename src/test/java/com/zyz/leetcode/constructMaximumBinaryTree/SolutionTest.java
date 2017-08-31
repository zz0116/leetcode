package com.zyz.leetcode.constructMaximumBinaryTree;

import com.zyz.leetcode.TreeNode;
import com.zyz.leetcode.TreeUtil;

/**
 * @author Zhang Yuanzhuo.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,1,6,0,5};
        TreeNode tree = solution.constructMaximumBinaryTree(nums);

        TreeUtil.print(tree);
    }
}