package com.zyz.leetcode;

import java.util.ArrayList;
import java.util.List;

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

    public TreeNode(Integer[] nums) {
        TreeNode root = createTreeFromArray(nums, 0);
        if (root != null) {
            this.val = root.val;
            this.left = root.left;
            this.right = root.right;
        }
    }

    /**
     * 由二叉树的先序遍历数组还原二叉树
     *
     * @return 根节点
     */
    private TreeNode createTreeFromArray(Integer[] nums, int index) {
        TreeNode tn = null;
        Integer num;
        if (index < nums.length && null != (num = nums[index])) {
            tn = new TreeNode(num);
            tn.left = createTreeFromArray(nums, index * 2 + 1);
            tn.right = createTreeFromArray(nums, index * 2 + 2);
        }
        return tn;
    }

    public Integer[] preOrderArray() {
        List<Integer> list = new ArrayList<>();
        preOrderList(list, this);
        return list.toArray(new Integer[]{});
    }

    private void preOrderList(List<Integer> list, TreeNode node) {
        if (node != null) {
            preOrderList(list, node.left);
            preOrderList(list, node.right);
            list.add(node.val);
        }
    }

}