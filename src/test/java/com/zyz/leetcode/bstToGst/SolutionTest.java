package com.zyz.leetcode.bstToGst;

import com.zyz.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 张远卓
 * @date 2019/5/7
 */
public class SolutionTest {

    @Test
    public void bstToGst() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new Integer[]{30, 36, 21, 36, 35, 26, 15, null, null, null, 33, null, null, null, 8},
                s.bstToGst(new TreeNode(new Integer[]{4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8})).preOrderArray());
    }
}