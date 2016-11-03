package com.zyz.leetcode.climbStairs;

/**
 * Created by ZhangYuanzhuo on 2016/11/2.
 */
public class Solution {
    public int climbStairs(int n) {
        /*
        * Fn = F(n-1) + F(n-2)
        * */
        int f1 = 1, f2 = 2, temp = 0;
        for(int i=3; i<=n; i++) {
            temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        if(n<3) {
            return n;
        }
        return temp;
    }
}