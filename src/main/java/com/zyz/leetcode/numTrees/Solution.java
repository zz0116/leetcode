package com.zyz.leetcode.numTrees;

/**
 * Created by ZhangYuanzhuo on 2016/11/16.
 */
public class Solution {
    public int numTrees(int n) {
        int cnt[] = new int[n + 1];
        cnt[0] = 1;
        cnt[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                cnt[i] += cnt[j] * cnt[i - 1 - j];
            }
        }
        return cnt[n];
    }
}