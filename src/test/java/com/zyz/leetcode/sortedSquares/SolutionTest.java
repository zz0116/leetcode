package com.zyz.leetcode.sortedSquares;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author 张远卓
 * @date 2019/5/6
 */
public class SolutionTest {

    @Test
    public void sortedSquares() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{0, 1, 9, 16, 100}, s.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
//        System.out.println(Arrays.toString(s.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        Assert.assertArrayEquals(new int[]{4, 9, 9, 49, 121}, s.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }
}