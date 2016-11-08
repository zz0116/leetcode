package com.zyz.leetcode.search;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/11/8.
 */
public class SolutionTest {
    @Test
    public void search() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 4));
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 6));
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7));
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1));
        System.out.println(solution.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2));
        System.out.println(solution.search(new int[]{1, 3}, 3));
    }

}