package com.zyz.leetcode.isValidSudoku;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2016/10/15.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*Each row must have the numbers 1-9 occuring just once.*/
        /*Each column must have the numbers 1-9 occuring just once.*/
        for(int i=0; i<9; i++) {
            for(int j=0; j<8; j++) {
                for(int k=j+1; k<9; k++) {
                    if(board[i][j]!='.' && board[i][j]==board[i][k]) {
                        return false;
                    }
                    if(board[j][i]!='.' && board[j][i]==board[k][i]) {
                        return false;
                    }
                }
            }
        }
        /*And the numbers 1-9 must occur just once in each of the 9 sub-boxes of the grid.*/
        for(int pRow=0; pRow<9; pRow=pRow+3) {
            for(int pCol=0; pCol<9; pCol=pCol+3) {
                ArrayList<Character> piece = new ArrayList<>();
                for(int i=pRow; i<pRow+3; i++) {
                    for(int j=pCol; j<pCol+3; j++) {
                        piece.add(board[i][j]);
                    }
                }
                for(int i=0; i<piece.size()-1; i++) {
                    for(int j=i+1; j<piece.size(); j++) {
                        if(piece.get(i)!='.' && piece.get(i)==piece.get(j)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}