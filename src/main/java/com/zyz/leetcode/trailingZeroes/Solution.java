package com.zyz.leetcode.trailingZeroes;

/**
 * Created by ZhangYuanzhuo on 2017/6/11.
 */
public class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}