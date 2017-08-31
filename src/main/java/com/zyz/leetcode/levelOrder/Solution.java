package com.zyz.leetcode.levelOrder;

import com.zyz.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ZhangYuanzhuo on 2016/11/19.
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> perLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                perLevel.add(head.val);
                if (head.left != null)
                    queue.offer(head.left);
                if (head.right != null)
                    queue.offer(head.right);
            }
            res.add(perLevel);
        }
        return res;
    }
}
