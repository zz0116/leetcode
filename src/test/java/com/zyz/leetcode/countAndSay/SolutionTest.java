package com.zyz.leetcode.countAndSay;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2016/10/17.
 */
public class SolutionTest {
    @Test
    public void countAndSay() throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(1));
        System.out.println(solution.countAndSay(2));
        System.out.println(solution.countAndSay(3));
        System.out.println(solution.countAndSay(4));
        System.out.println(solution.countAndSay(5));
    }

}