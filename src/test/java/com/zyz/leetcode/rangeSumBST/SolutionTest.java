package com.zyz.leetcode.rangeSumBST;

import com.zyz.leetcode.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 张远卓
 * @date 2019/5/6
 */
public class SolutionTest {

    @Test
    public void rangeSumBST() {
        Solution s = new Solution();

        TreeNode t1 = new TreeNode(new Integer[]{10, 5, 15, 3, 7, null, 18});
        Assert.assertEquals(32, s.rangeSumBST(t1, 7, 15));

        TreeNode t2 = new TreeNode(new Integer[]{10, 5, 15, 3, 7, 13, 18, 1, null, 6});
        Assert.assertEquals(23, s.rangeSumBST(t2, 6, 10));
    }
}