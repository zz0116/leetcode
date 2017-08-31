package com.zyz.leetcode.zigzagLevelOrder;

import com.zyz.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ZhangYuanzhuo on 2016/11/30.
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
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
            if (level % 2 == 0) {
                res.add(perLevel);
            } else {
                res.add(reverse(perLevel));
            }
            level++;
        }
        return res;
    }

    private List<Integer> reverse(List<Integer> perLevel) {
        List<Integer> reverse = new ArrayList<>();
        for (int i = perLevel.size() - 1; i >= 0; i--) {
            reverse.add(perLevel.get(i));
        }
        return reverse;
    }
}
