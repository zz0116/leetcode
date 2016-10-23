package com.zyz.leetcode.rotate;

/**
 * Created by ZhangYuanzhuo on 2016/10/22.
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mxtemp = new int[n][n];
        for(int i=0; i<n; i++) {
            System.arraycopy(matrix[i], 0, mxtemp[i], 0, n);
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = mxtemp[n-1-j][i];
            }
        }
    }
}