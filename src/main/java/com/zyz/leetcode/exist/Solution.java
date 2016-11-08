package com.zyz.leetcode.exist;

/**
 * Created by ZhangYuanzhuo on 2016/11/7.
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] used = new boolean[m][n];
        char[] chars = word.toCharArray();
        char firstC = chars[0];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(firstC == board[i][j]) {
                    used[i][j] = true;
                    if(chars.length==1) {
                        return true;
                    }
                    if(findRest(1, i, j, chars, used, m, n, board)) {
                        return true;
                    }
                    used[i][j] = false;
                }
            }
        }
        return false;
    }

    private boolean findRest(int i, int lastI, int lastJ, char[] chars, boolean[][] used, int m, int n, char[][] board) {
        if(lastI-1>=0 && chars[i]==board[lastI-1][lastJ] && !used[lastI-1][lastJ]) {
            used[lastI-1][lastJ] = true;
            if(i==chars.length-1) {
                return true;
            }
            if(findRest(i+1, lastI-1, lastJ, chars, used, m, n, board)) {
                return true;
            }
            used[lastI-1][lastJ] = false;
        }
        if(lastI+1<m && chars[i]==board[lastI+1][lastJ] && !used[lastI+1][lastJ]) {
            used[lastI+1][lastJ] = true;
            if(i==chars.length-1) {
                return true;
            }
            if(findRest(i+1, lastI+1, lastJ, chars, used, m, n, board)) {
                return true;
            }
            used[lastI+1][lastJ] = false;
        }
        if(lastJ-1>=0 && chars[i]==board[lastI][lastJ-1] && !used[lastI][lastJ-1]) {
            used[lastI][lastJ-1] = true;
            if(i==chars.length-1) {
                return true;
            }
            if(findRest(i+1, lastI, lastJ-1, chars, used, m, n, board)) {
                return true;
            }
            used[lastI][lastJ-1] = false;
        }
        if(lastJ+1<n && chars[i]==board[lastI][lastJ+1] && !used[lastI][lastJ+1]) {
            used[lastI][lastJ+1] = true;
            if(i==chars.length-1) {
                return true;
            }
            if(findRest(i+1, lastI, lastJ+1, chars, used, m, n, board)) {
                return true;
            }
            used[lastI][lastJ+1] = false;
        }
        return false;
    }
}