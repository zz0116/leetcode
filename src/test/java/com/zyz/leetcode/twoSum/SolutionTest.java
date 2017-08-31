package com.zyz.leetcode.twoSum;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/9/26.
 */
public class SolutionTest {
    @Test
    public void twoSumTest() throws Exception {
        Solution solution = new Solution();

        for(int i:solution.twoSum(new int[]{1,2,4}, 6)) {
            System.out.println(i);
        }
    }

}
