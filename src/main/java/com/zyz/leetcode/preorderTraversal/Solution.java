package com.zyz.leetcode.preorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ZhangYuanzhuo on 2017/6/4.
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> rights = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        TreeNode t = root;
        while (t != null) {
            list.add(t.val);
            if (t.right != null) {
                rights.push(t.right);
            }
            t = t.left;
            if (t == null && !rights.isEmpty()) {
                t = rights.pop();
            }
        }

        return list;
    }
}