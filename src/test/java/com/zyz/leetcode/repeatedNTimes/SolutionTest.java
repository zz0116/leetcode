package com.zyz.leetcode.repeatedNTimes;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 张远卓
 * @date 2019/5/6
 */
public class SolutionTest {

    @Test
    public void repeatedNTimes() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.repeatedNTimes(new int[]{1, 2, 3, 3}));
        Assert.assertEquals(2, s.repeatedNTimes(new int[]{2, 1, 2, 5, 3, 2}));
        Assert.assertEquals(5, s.repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }
}