package com.zyz.leetcode.numDecodings;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/11/12.
 */
public class SolutionTest {
    @Test
    public void numDecodings() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.numDecodings("1"));
        System.out.println(solution.numDecodings("12"));
        System.out.println(solution.numDecodings("123"));
        System.out.println(solution.numDecodings("1201"));
        System.out.println(solution.numDecodings("12026"));
        System.out.println(solution.numDecodings("0"));
        System.out.println(solution.numDecodings("00"));
        System.out.println(solution.numDecodings("17"));
    }

}