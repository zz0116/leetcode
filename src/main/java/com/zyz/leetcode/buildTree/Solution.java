package com.zyz.leetcode.buildTree;

/**
 * Created by ZhangYuanzhuo on 2016/12/1.
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preL = 0;
        int preR = preorder.length - 1;
        int inL = 0;
        int inR = inorder.length - 1;

        return helper(preorder, preL, preR, inorder, inL, inR);
    }

    private TreeNode helper(int[] preorder, int preL, int perR, int[] inorder, int inL, int inR) {
        if (preL > perR || inL > inR)
            return null;
        int head = preorder[preL];
        TreeNode p = new TreeNode(head);

        int key = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (head == inorder[i]) {
                key = i;
                break;
            }
        }

        p.left = helper(preorder, preL + 1, preL + key - inL, inorder, inL, key - 1);
        p.right = helper(preorder, preL + key - inL + 1, perR, inorder, key + 1, inR);

        return p;
    }
}