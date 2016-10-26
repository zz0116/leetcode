package com.zyz.leetcode.convert;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/9/26.
 */
public class SolutionTest {
    @Test
    public void convert() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.convert("PAYPALISHIRING", 3));
        System.out.println(solution.convert("A", 1));
        System.out.println(solution.convert("ABC", 3));
        System.out.println(solution.convert("ABCDEF", 4));
    }

}