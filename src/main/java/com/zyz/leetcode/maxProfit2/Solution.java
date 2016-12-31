package com.zyz.leetcode.maxProfit2;

/**
 * Created by ZhangYuanzhuo on 2016/12/24.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        if (n < 2)
            return profit;
        int tmp = prices[0];
        for (int i = 1; i < n; i++) {
            if (tmp < prices[i])
                profit += prices[i] - tmp;
            tmp = prices[i];
        }
        return profit;
    }
}