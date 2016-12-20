package com.zyz.leetcode.connect;

/**
 * Created by ZhangYuanzhuo on 2016/12/18.
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null)
            return;
        if (root.left != null)
            root.left.next = root.right;
        if (root.next != null && root.right != null)
            root.right.next = root.next.left;
        connect(root.left);
        connect(root.right);
    }
}