package com.zyz.leetcode.combinationSum2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2016/10/19.
 */
public class SolutionTest {
    @Test
    public void combinationSum2() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println(solution.combinationSum2(new int[]{1, 6, 1}, 8));
        System.out.println(solution.combinationSum2(new int[]{1}, 1));
        System.out.println(solution.combinationSum2(new int[]{2, 2, 2}, 2));
    }

}