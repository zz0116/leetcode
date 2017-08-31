package com.zyz.leetcode.majorityElement;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2017/6/11.
 */
public class SolutionTest {
    @Test
    public void majorityElement() throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.majorityElement(new int[]{1}));
        System.out.println(solution.majorityElement(new int[]{1, 0, 0}));
    }

}