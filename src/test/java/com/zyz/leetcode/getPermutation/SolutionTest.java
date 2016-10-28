package com.zyz.leetcode.getPermutation;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/10/27.
 */
public class SolutionTest {
    @Test
    public void getPermutation() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.getPermutation(3, 3));
        System.out.println(solution.getPermutation(4, 7));
        System.out.println(solution.getPermutation(5, 9));
        System.out.println(solution.getPermutation(5, 39));
    }

}