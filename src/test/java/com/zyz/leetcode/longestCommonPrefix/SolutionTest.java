package com.zyz.leetcode.longestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zhang Yuangzhuo on 2016/9/30.
 */
public class SolutionTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        Solution solution = new Solution();
        String[] strs = {"flower","flow","flight"};

        System.out.println(solution.longestCommonPrefix(strs));
    }

}