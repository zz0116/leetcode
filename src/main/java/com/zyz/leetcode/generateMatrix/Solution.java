package com.zyz.leetcode.generateMatrix;

/**
 * Created by ZhangYuanzhuo on 2016/10/27.
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int m = 1;
        for(int ring=0; ring<=n/2; ring++) {
            for(int i=ring; i<n-ring; i++) {
                res[ring][i] = m++;
            }
            for(int i=ring+1; i<n-ring; i++) {
                res[i][n-1-ring] = m++;
            }
            for(int i=n-2-ring; i>=ring; i--) {
                res[n-1-ring][i] = m++;
            }
            for(int i=n-2-ring; i>=ring+1; i--) {
                res[i][ring] = m++;
            }
        }
        return res;
    }
}