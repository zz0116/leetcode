package com.zyz.leetcode.connect2;

/**
 * Created by ZhangYuanzhuo on 2016/12/18.
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode leftEnd = null;
        TreeLinkNode cur = root;
        TreeLinkNode pre = null;

        while (cur != null) {

            while (cur != null) {
                if (cur.left != null) {
                    if (pre != null) {
                        pre.next = cur.left;
                    } else {
                        leftEnd = cur.left;
                    }
                    pre = cur.left;
                }

                if (cur.right != null) {
                    if (pre != null) {
                        pre.next = cur.right;
                    } else {
                        leftEnd = cur.right;
                    }
                    pre = cur.right;
                }

                cur = cur.next;
            }

            cur = leftEnd;
            leftEnd = null;
            pre = null;
        }
    }
}