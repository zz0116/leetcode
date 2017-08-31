package com.zyz.leetcode.inorderTraversal;

import com.zyz.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ZhangYuanzhuo on 2016/11/15.
 */
public class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode t = stack.pop();
                res.add(t.val);
                p = t.right;
            }
        }
        return res;
    }
}
