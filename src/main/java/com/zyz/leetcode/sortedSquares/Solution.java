package com.zyz.leetcode.sortedSquares;

import java.util.Arrays;

/**
 * @author 张远卓
 * @date 2019/5/6
 */
public class Solution {
    public int[] sortedSquares(int[] a) {
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int ai = a[i];
            res[i] = ai * ai;
        }
        Arrays.sort(res);
        return res;
    }
}
