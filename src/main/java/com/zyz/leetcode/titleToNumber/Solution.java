package com.zyz.leetcode.titleToNumber;

/**
 * Created by ZhangYuanzhuo on 2017/6/11.
 */
public class Solution {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret += (Math.pow(26, s.length() - i - 1) * (chars[i] - 'A' + 1));
        }
        return ret;
    }
}