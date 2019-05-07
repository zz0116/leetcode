package com.zyz.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
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
     * 由二叉树的层序遍历数组还原二叉树
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

    // TODO: 有数据的层的null得add进去
    public Integer[] levelOrderArray() {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            list.add(temp.val);
            if (temp.left != null) queue.offer(temp.left);
            if (temp.right != null) queue.offer(temp.right);
        }
        return list.toArray(new Integer[]{});
    }

    private int findDeep(TreeNode root) {
        if (root != null) {
            int leftDeep = findDeep(root.left);
            int rightDeep = findDeep(root.right);
            return leftDeep > rightDeep ? leftDeep + 1 : rightDeep + 1;
        } else  {
            return 0;
        }
    }
}