package com.zyz.leetcode.numUniqueEmails;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author 张远卓
 * @create 2019/4/25 19:31
 * @description
 */
public class SolutionTest {

    @Test
    public void numUniqueEmails() {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
        Assert.assertEquals(1, solution.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email@leetcode.com"}));
    }
}