package com.zyz.leetcode.maxSubArray;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/10/24.
 */
public class SolutionTest {
    @Test
    public void maxSubArray() throws Exception {
        Solution solution = new Solution();

//        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(solution.maxSubArray(new int[]{-2, -1}));
        System.out.println(solution.maxSubArray(new int[]{-1, -2}));
    }

}