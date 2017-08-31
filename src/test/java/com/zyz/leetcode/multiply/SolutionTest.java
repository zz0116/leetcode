package com.zyz.leetcode.multiply;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/10/21.
 */
public class SolutionTest {
    @Test
    public void multiply() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.multiply("11", "2"));
        System.out.println(solution.multiply("3", "2"));
        System.out.println(solution.multiply("3", "0"));
        System.out.println(solution.multiply("3", "9"));
        System.out.println(solution.multiply("321", "987"));
        System.out.println(solution.multiply("", ""));
        System.out.println(solution.multiply("21", ""));
    }

}