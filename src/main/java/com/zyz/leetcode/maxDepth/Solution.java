package com.zyz.leetcode.maxDepth;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ZhangYuanzhuo on 2016/12/1.
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int res = 0;
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            res++;
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null)
                    queue.offer(head.left);
                if (head.right != null)
                    queue.offer(head.right);
            }
        }
        return res;
    }
}