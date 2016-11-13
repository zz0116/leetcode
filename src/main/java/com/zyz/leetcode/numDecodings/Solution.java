package com.zyz.leetcode.numDecodings;

/**
 * Created by ZhangYuanzhuo on 2016/11/12.
 */
public class Solution {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        if (s.length() < 1) {
            return 0;
        }
        return helper(0, chars, 0);
    }

    private int helper(int index, char[] chars, int cnt) {
        if (index == chars.length) {
            cnt++;
            return cnt;
        }
        if (index < chars.length - 1) {
            if (chars[index + 1] == '0' && chars[index] > '0' && chars[index] < '3') {
                cnt = helper(index + 2, chars, cnt);
            } else if (chars[index] == '1' || (chars[index] == '2' && chars[index + 1] < '7')) {
                cnt = helper(index + 2, chars, cnt);
            }
        }
        if (chars[index] != '0') {
            cnt = helper(index + 1, chars, cnt);
        }
        return cnt;
    }
}