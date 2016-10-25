package com.zyz.leetcode.spiralOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/10/24.
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0) {
            return res;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int inc = 0;
        int i, j, p, q;
        boolean[][] added = new boolean[m][n];
        while(true) {
            for (j = inc; j < n - inc; j++) {
                if(added[inc][j]) {
                    return res;
                }
                res.add(matrix[inc][j]);
                added[inc][j]=true;
            }
            for (i = inc+1; i < m - inc; i++) {
                if(added[i][j - 1]) {
                    return res;
                }
                res.add(matrix[i][j-1]);
                added[i][j-1]=true;
            }
            for (q = n - 2 - inc; q >= inc; q--) {
                if(added[i - 1][q]) {
                    return res;
                }
                res.add(matrix[i-1][q]);
                added[i-1][q]=true;
            }
            for (p = m - 2 - inc; p > inc; p--) {
                if(added[p][q + 1]) {
                    return res;
                }
                res.add(matrix[p][q+1]);
                added[p][q+1]=true;
            }
            inc++;
            if(inc>n-1 || inc>m-1) {
                return res;
            }
        }
    }
}