package com.zyz.leetcode.uniquePaths;

/**
 * Created by ZhangYuanzhuo on 2016/10/29.
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int res = 0;
        int[][] coord = new int[m][n];
        if(m==0||n==0) {
            return 0;
        }
        coord[0][0] = 1;
        for(int i=1; i<m; i++) {
            coord[i][0] += coord[i-1][0];
        }
        for(int j=1; j<n; j++) {
            coord[0][j] += coord[0][j-1];
        }
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                coord[i][j] = coord[i-1][j] + coord[i][j-1];
            }
        }
        res = coord[m-1][n-1];
        return res;
    }
}