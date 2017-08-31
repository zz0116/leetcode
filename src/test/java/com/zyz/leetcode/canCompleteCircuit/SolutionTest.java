package com.zyz.leetcode.canCompleteCircuit;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/12/31.
 */
public class SolutionTest {
    @Test
    public void canCompleteCircuit() throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.canCompleteCircuit(new int[]{4, 5, 3, 2}, new int[]{5, 4, 1, 2}));
    }

}