package com.zyz.leetcode.longestPalindrome;

import org.junit.Test;

/**
 * Created by Zhang Yuanzhuo on 2016/10/2.
 */
public class SolutionTest {
    @Test
    public void longestPalindrome() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.longestPalindrome("abcbadd"));
        System.out.println(solution.longestPalindrome("abb"));
    }

}