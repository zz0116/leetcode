package com.zyz.leetcode.convertToTitle;

/**
 * Created by ZhangYuanzhuo on 2017/6/11.
 */
public class Solution {
    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle(--n / 26) + (char) ('A' + n % 26);
    }
}