package com.zyz.leetcode.twoSum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/9/26.
 */
public class SolutionTest {

    private Solution solution = new Solution();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void twoSumTest() throws Exception {
        for(int i:solution.twoSum(new int[]{1,2,4}, 6)) {
            System.out.println(i);
        }
    }

}
