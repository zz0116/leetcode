package com.zyz.leetcode.findNthDigit;

/**
 * Created by ZhangYuanzhuo on 2017/7/3.
 */
public class Solution {
    public int findNthDigit(int n) {
        /**
         * @param k 位数
         */
        int k = 0;
        while (n > 0) {
            k++;
            n -= k * 9 * (int) Math.pow(10, k - 1);
        }

//        没写完
//        for (int i = k; i > 0; i--) {
//            while (n > 0) {
//                n -= i * (int) Math.pow(10, i - 1);
//            }
//        }
        return 0;
    }
}