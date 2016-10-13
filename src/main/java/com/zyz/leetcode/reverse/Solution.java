package com.zyz.leetcode.reverse;

/**
 * Created by ZhangYuanzhuo on 2016/9/29.
 */
public class Solution {
    public int reverse(int x) {
        long result;

        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        String ret = "";

        if ('-' == chars[0]) {
            ret = "-";
            for (int j = 1; j < chars.length; j++) {
                ret += chars[chars.length - j];
            }
        } else {
            for (int j = 1; j <= chars.length; j++) {
                ret += chars[chars.length - j];
            }
        }

        result = Long.parseLong(ret);
        if (result < -2147483648 || result > 2147483647) {
            return 0;
        }

        return (int) result;
    }
}