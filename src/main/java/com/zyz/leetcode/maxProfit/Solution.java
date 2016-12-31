package com.zyz.leetcode.maxProfit;

/**
 * Created by ZhangYuanzhuo on 2016/12/23.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2)
            return 0;
        int curMin = prices[0];
        int profit = 0;
        for (int i = 0; i < n; i++) {
            curMin = Math.min(curMin, prices[i]);
            profit = Math.max(profit, prices[i] - curMin);
        }
        return profit;
    }
}