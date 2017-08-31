package com.zyz.leetcode.letterCombinations;

import org.junit.Test;

/**
 * Created by Zhang Yuanzhuo on 2016/10/6.
 */
public class SolutionTest {
    @Test
    public void letterCombinations() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.letterCombinations("4"));
        System.out.println(solution.letterCombinations("43"));
        System.out.println(solution.letterCombinations("432"));
        System.out.println(solution.letterCombinations("4389"));
    }

}