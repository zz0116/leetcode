package com.zyz.leetcode.myPow;

/**
 * Created by ZhangYuanzhuo on 2016/10/23.
 */
public class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        if(x<0) {
            if(n%2==1) {
                res = -res;
            }
            x = -x;
        }
        if(x==1||x==-1) {
            return res;
        }
        if(n>0) {
            res = helper(x, n, res);
        }else if(n<0) {
            n = -n;
            x = 1/x;
            res = helper(x, n, res);
        }
        return res;
    }
    private double helper(double x, int n, double res) {
        while(n-- != 0) {
            res *= x;
            if(Math.abs(res)<0.000005) {
                return 0;
            }
        }
        return res;
    }
}