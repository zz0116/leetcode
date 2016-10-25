package com.zyz.leetcode.spiralOrder;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/10/25.
 */
public class SolutionTest {
    @Test
    public void spiralOrder() throws Exception {
        Solution solution = new Solution();
        System.out.println(solution.spiralOrder(new int[][]{}));
        System.out.println(solution.spiralOrder(new int[][]{{1}}));
        System.out.println(solution.spiralOrder(new int[][]{{3},{2}}));
        System.out.println(solution.spiralOrder(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(solution.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(solution.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}));
    }

}