package com.zyz.leetcode.combine;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2016/11/7.
 */
public class SolutionTest {
    @Test
    public void combine() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.combine(4, 0));
        System.out.println(solution.combine(4, 1));
        System.out.println(solution.combine(4, 2));
        System.out.println(solution.combine(4, 3));
        System.out.println(solution.combine(4, 4));
    }

}