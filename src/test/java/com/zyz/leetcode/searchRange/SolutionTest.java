package com.zyz.leetcode.searchRange;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2016/10/15.
 */
public class SolutionTest {
    @Test
    public void searchRange() throws Exception {
        Solution solution = new Solution();

//        System.out.println(Arrays.toString(solution.searchRange(new int[]{1, 2, 3, 3, 4, 4, 4, 5, 6, 7}, 4)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{2, 2}, 1)));
        System.out.println(Arrays.toString(solution.searchRange(new int[]{1}, 1)));
    }

}