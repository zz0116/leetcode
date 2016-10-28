package com.zyz.leetcode.generateMatrix;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2016/10/27.
 */
public class SolutionTest {
    @Test
    public void generateMatrix() throws Exception {
        Solution solution = new Solution();

        System.out.println(Arrays.deepToString(solution.generateMatrix(3)));
        System.out.println(Arrays.deepToString(solution.generateMatrix(4)));
    }

}