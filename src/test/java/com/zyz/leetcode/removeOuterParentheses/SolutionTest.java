package com.zyz.leetcode.removeOuterParentheses;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 张远卓
 * @create 2019/4/18 19:08
 * @description
 */
public class SolutionTest {

    @Test
    public void removeOuterParentheses() {
        Solution solution = new Solution();
        Assert.assertEquals("()()()", solution.removeOuterParentheses("(()())(())"));
        Assert.assertEquals("()()()()(())", solution.removeOuterParentheses("(()())(())(()(()))"));
        Assert.assertEquals("", solution.removeOuterParentheses("()()"));
        Assert.assertEquals("", solution.removeOuterParentheses("()()()()()()()()()()"));
    }
}