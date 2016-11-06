package com.zyz.leetcode.searchMatrix;

/**
 * Created by ZhangYuanzhuo on 2016/11/6.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        int m = matrix.length;
        int n = matrix[0].length;
        if(m==1) {
            for(int j=0; j<n; j++) {
                if(target == matrix[0][j]) {
                    return true;
                }
            }
            return false;
        }
        if(n==1) {
            for(int i=0; i<m; i++) {
                if(target == matrix[i][0]) {
                    return true;
                }
            }
            return false;
        }
        for(int i=0; i<m-1; i++) {
            if(target>=matrix[i][0] && target<matrix[i+1][0]) {
                res = searchRow(i, n, target, matrix);
                break;
            }
            if(i==m-2) {
                res = searchRow(m-1, n, target, matrix);
            }
        }
        return res;
    }

    private boolean searchRow(int i, int n, int target, int[][] matrix) {
        for(int j=0; j<n; j++) {
            if(target == matrix[i][j]) {
                return true;
            }
        }
        return false;
    }
}