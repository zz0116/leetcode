package com.zyz.leetcode.plusOne;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2016/10/31.
 */
public class SolutionTest {
    @Test
    public void plusOne() throws Exception {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.plusOne(new int[]{9, 9, 9, 9})));
    }

}