package com.zyz.leetcode.findNthDigit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2017/7/3.
 */
public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void findNthDigit() throws Exception {
        Assert.assertEquals(3, solution.findNthDigit(3));
        Assert.assertEquals(0, solution.findNthDigit(11));
    }
}