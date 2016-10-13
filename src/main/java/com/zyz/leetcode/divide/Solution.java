package com.zyz.leetcode.divide;

/**
 * Created by ZhangYuanzhuo on 2016/10/13.
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        int res = 0;
        long lDividend = dividend, lDivisor = divisor;
        boolean sign = true;
        if (dividend < 0) {
            sign = !sign;
            if (dividend == -2147483648 && divisor == -1) {
                return 2147483647;
            }
            lDividend = -dividend;
        }
        if (divisor < 0) {
            sign = !sign;
            lDivisor = -divisor;
        }
        if (divisor == 0) {
            throw new ArithmeticException("/ by zero");
        }
        if (divisor == 1) {
            return dividend;
        }

        while (lDividend >= lDivisor) {
            int shift = 0;
            while (lDividend >= (lDivisor << shift)) {
                shift++;
            }
            res += 1 << (shift - 1);
            lDividend -= lDivisor << (shift - 1);
        }
        if (sign) {
            return res;
        } else {
            return -res;
        }
    }
}