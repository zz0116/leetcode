package com.zyz.leetcode.setZeroes;

import java.util.HashSet;

/**
 * Created by ZhangYuanzhuo on 2016/11/6.
 */
public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();
        for(int i=0; i<m; i++) {
            for(int j=0;j<n; j++) {
                if(matrix[i][j]==0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for(int i=0; i<m; i++) {
            if(zeroRows.contains(i)) {
                for(int j=0; j<n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j=0; j<n; j++) {
            if(zeroCols.contains(j)) {
                for(int i=0; i<m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}