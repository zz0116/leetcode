package com.zyz.leetcode;

/**
 * @author Zhang Yuanzhuo.
 */
public class TreeUtil {
    public static void print(TreeNode tree) {
        print(tree, 0, "head : ");
    }

    private static void print(TreeNode tree, int depth, String position) {
        if (tree == null) {
            return;
        }
        System.out.println(position + tree.val);

        print(tree.left, depth + 1, tree.val + "'s l: ");
        print(tree.right, depth + 1, tree.val + "'s r: ");
    }
}
