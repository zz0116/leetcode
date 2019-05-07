package com.zyz.leetcode.bstToGst;

import com.zyz.leetcode.TreeNode;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author 张远卓
 * @date 2019/5/7
 */
public class SolutionTest {

    @Test
    public void bstToGst() {
        Solution s = new Solution();
        TreeNode treeNode = s.bstToGst(new TreeNode(new Integer[]{4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8}));
        System.out.println(Arrays.toString(treeNode.levelOrderArray()));
//        Assert.assertArrayEquals(new Integer[]{30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8},
//                s.bstToGst(new TreeNode(new Integer[]{4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8})).levelOrderArray());
    }
}