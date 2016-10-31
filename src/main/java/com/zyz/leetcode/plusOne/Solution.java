package com.zyz.leetcode.plusOne;

/**
 * Created by ZhangYuanzhuo on 2016/10/31.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        helper(digits, n-1);
        if(digits[0]==0) {
            int[] newDigi = new int[n+1];
            newDigi[0] = 1;
            System.arraycopy(digits, 0, newDigi, 1, n);
            return newDigi;
        }else {
            return digits;
        }
    }
    private void helper(int[] digits, int i) {
        int temp = digits[i];
        if (temp + 1 < 10) {
            digits[i] = digits[i] + 1;
        } else {
            digits[i] = digits[i] - 9;
            if (i == 0) {
                digits[0] = 0;
                return;
            }
            helper(digits, i - 1);
        }
    }
}