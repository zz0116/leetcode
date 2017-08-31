package com.zyz.leetcode.levelOrderBottom;

import com.zyz.leetcode.TreeNode;

import java.util.*;

/**
 * Created by ZhangYuanzhuo on 2016/12/6.
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
        Collections.reverse(res);
        return res;
    }
}
