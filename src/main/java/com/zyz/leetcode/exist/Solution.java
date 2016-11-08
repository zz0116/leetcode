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
        char head = chars[0];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(head == board[i][j]) {
                    used[i][j] = true;
                    if(findNext(1, i, j, chars, used, m, n, board)) {
                        return true;
                    }
                    used[i][j] = false;
                }
            }
        }
        return false;
    }

    private boolean findNext(int i, int lastI, int lastJ, char[] chars, boolean[][] used, int m, int n, char[][] board) {
        if(chars[i]==upItem(lastI, lastJ, used, m, board)) {
            lastI--;
            used[lastI][lastJ] = true;
            if(i==chars.length-1) {
                return true;
            }
            if(findNext(i++, lastI, lastJ, chars, used, m, n, board)) {
                return true;
            }
            used[lastI][lastJ] = false;
            lastI++;
        }
        if(chars[i]==downItem(lastI, lastJ, used, m, board)) {
            lastI++;
            used[lastI][lastJ] = true;
            if(i==chars.length-1) {
                return true;
            }
            if(findNext(i++, lastI, lastJ, chars, used, m, n, board)) {
                return true;
            }
            used[lastI][lastJ] = false;
            lastI--;
        }
        if(chars[i]==leftItem(lastI, lastJ, used, n, board)) {
            lastJ--;
            used[lastI][lastJ] = true;
            if(i==chars.length-1) {
                return true;
            }
            if(findNext(i++, lastI, lastJ, chars, used, m, n, board)) {
                return true;
            }
            used[lastI][lastJ] = false;
            lastJ++;
        }
        if(chars[i]==rightItem(lastI, lastJ, used, n, board)) {
            lastJ++;
            used[lastI][lastJ] = true;
            if(i==chars.length-1) {
                return true;
            }
            if(findNext(i++, lastI, lastJ, chars, used, m, n, board)) {
                return true;
            }
            used[lastI][lastJ] = false;
            lastJ--;
        }
        return false;
    }

    private char upItem(int lastI, int lastJ, boolean[][] used, int m, char[][] board) {
        lastI--;
        if(lastI>=0 && lastI<m && !used[lastI][lastJ]) {
            return board[lastI][lastJ];
        }
        return '0';
    }

    private char downItem(int lastI, int lastJ, boolean[][] used, int m, char[][] board) {
        lastI++;
        if(lastI>=0 && lastI<m && !used[lastI][lastJ]) {
            return board[lastI][lastJ];
        }
        return '0';
    }

    private char leftItem(int lastI, int lastJ, boolean[][] used, int n, char[][] board) {
        lastJ--;
        if(lastJ>=0 && lastJ<n && !used[lastI][lastJ]) {
            return board[lastI][lastJ];
        }
        return '0';
    }

    private char rightItem(int lastI, int lastJ, boolean[][] used, int n, char[][] board) {
        lastJ++;
        if(lastJ>=0 && lastJ<n && !used[lastI][lastJ]) {
            return board[lastI][lastJ];
        }
        return '0';
    }
}