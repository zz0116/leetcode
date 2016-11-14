package com.zyz.leetcode.restoreIpAddresses;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/11/14.
 */
public class SolutionTest {
    @Test
    public void restoreIpAddresses() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.restoreIpAddresses("0000"));
        System.out.println(solution.restoreIpAddresses("25525511135"));
    }

}