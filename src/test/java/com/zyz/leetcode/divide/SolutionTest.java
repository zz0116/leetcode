package com.zyz.leetcode.divide;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/10/13.
 */
public class SolutionTest {
    @Test
    public void divide() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.divide(5, 2));
        System.out.println(solution.divide(6, 2));
        System.out.println(solution.divide(-1, 1));
        System.out.println(solution.divide(1, -1));
        System.out.println(solution.divide(-6, 2));
        System.out.println(solution.divide(-2147483648, 2));
//        System.out.println(solution.divide(-2147483648, -2));
//        System.out.println(solution.divide(-1010369383, -2147483648));
    }

}