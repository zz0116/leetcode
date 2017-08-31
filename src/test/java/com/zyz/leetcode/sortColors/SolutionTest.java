package com.zyz.leetcode.sortColors;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2016/11/6.
 */
public class SolutionTest {
    @Test
    public void sortColors() throws Exception {
        Solution solution = new Solution();
        int[] num1 = {1, 2, 0, 2, 0, 1};
        solution.sortColors(num1);
        System.out.println(Arrays.toString(num1));
        int[] num2 = {2};
        solution.sortColors(num2);
        System.out.println(Arrays.toString(num2));
        int[] num3 = {1, 2};
        solution.sortColors(num3);
        System.out.println(Arrays.toString(num3));
        int[] num4 = {0, 1, 2};
        solution.sortColors(num4);
        System.out.println(Arrays.toString(num4));
        int[] num5 = {2,0,0,0,0,1,2,2};
        solution.sortColors(num5);
        System.out.println(Arrays.toString(num5));
    }

}