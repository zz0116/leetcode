package com.zyz.leetcode.minimumTotal;

import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/12/21.
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] res = new int[n];
        for (int j = 0; j < n; j++) {
            res[j] = triangle.get(n - 1).get(j);
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                res[j] = Math.min(res[j], res[j + 1]) + triangle.get(i).get(j);
            }
        }
        return res[0];
    }
}