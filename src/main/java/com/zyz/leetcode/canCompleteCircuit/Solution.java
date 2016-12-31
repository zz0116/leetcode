package com.zyz.leetcode.canCompleteCircuit;

/**
 * Created by ZhangYuanzhuo on 2016/12/31.
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = -1;
        int n = gas.length;
        for (int key = 0; key < n && res == -1; key++) {
            int curGas = 0;
            int i;
            for (i = key + 1; i <= key + n; i++) {
                if (i >= n)
                    i -= n;
                if (i == 0)
                    curGas += gas[n - 1] - cost[n - 1];
                else
                    curGas += gas[i - 1] - cost[i - 1];
                if (curGas < 0)
                    break;
                if (i == key) {
                    res = key;
                    break;
                }
            }
        }
        return res;
    }
}