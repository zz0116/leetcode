package com.zyz.leetcode.buildTree2;

/**
 * Created by ZhangYuanzhuo on 2016/12/5.
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inL = 0;
        int inR = inorder.length - 1;
        int postL = 0;
        int postR = postorder.length - 1;

        return helper(inorder, inL, inR, postorder, postL, postR);
    }

    private TreeNode helper(int[] inorder, int inL, int inR, int[] postorder, int postL, int postR) {
        if (postL > postR || inL > inR)
            return null;
        int head = postorder[postR];
        TreeNode p = new TreeNode(head);

        int key = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (head == inorder[i]) {
                key = i;
                break;
            }
        }

        p.left = helper(inorder, inL, key - 1, postorder, postL, postL + key - inL - 1);
        p.right = helper(inorder, key + 1, inR, postorder, postL + key - inL, postR - 1);

        return p;
    }
}