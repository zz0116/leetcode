package com.zyz.leetcode.rightSideView;

import com.zyz.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/6/13.
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, 0, list);
        return list;
    }

    private void preOrder(TreeNode p, int depth, List<Integer> list) {
        if (p == null) {
            return;
        }
        if (depth == list.size()) {
            list.add(p.val);
        }
        preOrder(p.right, depth + 1, list);
        preOrder(p.left, depth + 1, list);
    }
}