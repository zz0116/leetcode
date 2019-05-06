package com.zyz.leetcode.sortArrayByParity;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author 张远卓
 * @date 2019/5/6
 */
public class SolutionTest {

    @Test
    public void sortArrayByParity() {
        Solution s = new Solution();
//        Assert.assertArrayEquals(new int[]{2, 4, 3, 1}, s.sortArrayByParity(new int[]{3, 1, 2, 4}));
        System.out.println(Arrays.toString(s.sortArrayByParity(new int[]{3, 1, 2, 4})));
    }
}