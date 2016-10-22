package com.zyz.leetcode.permute;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2016/10/21.
 */
public class SolutionTest {
    @Test
    public void permute() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.permute(new int[]{1, 2, 3}));
        System.out.println(solution.permute(new int[]{5,4,6,2}));
        System.out.println(solution.permute(new int[]{1,1,2}));
    }

}