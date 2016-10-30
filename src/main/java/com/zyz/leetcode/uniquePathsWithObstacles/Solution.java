package com.zyz.leetcode.uniquePathsWithObstacles;

/**
 * Created by ZhangYuanzhuo on 2016/10/30.
 */
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] res = new int[m][n];
        if(m==0||n==0) {
            return 0;
        }
        if(obstacleGrid[0][0]==0) {
            res[0][0] = 1;
        }else {
            return 0;
        }
        for(int i=1; i<m; i++) {
            if(obstacleGrid[i][0]==1) {
                break;
            }
            res[i][0] += res[i-1][0];
        }
        for(int j=1; j<n; j++) {
            if(obstacleGrid[0][j]==1) {
                break;
            }
            res[0][j] += res[0][j-1];
        }
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(obstacleGrid[i][j]==1) {
                    continue;
                }
                res[i][j] = res[i-1][j] + res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
}