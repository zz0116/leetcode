package com.zyz.leetcode.mySqrt;

/**
 * Created by ZhangYuanzhuo on 2016/11/2.
 */
public class Solution {
    public int mySqrt(int x) {
        long min = 1, max = x;
        while(min + 1 < max) {
            long mid = (min + max) / 2;
            if(mid * mid < x) {
                min = mid;
            }else {
                max = mid;
            }
        }
        if(max * max <= x) {
            return (int) max;
        }
        return (int) min;
    }
}