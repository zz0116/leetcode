package com.zyz.leetcode.judgeCircle;

/**
 * @author Zhang Yuanzhuo.
 */
class Solution {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        Coordinate coor = new Coordinate();
        for (char c : chars) {
            coor.move(c);
        }
        return coor.backToOrigin();
    }

    class Coordinate {
        int x;
        int y;
        void move(char step) {
            switch (step) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        boolean backToOrigin() {
            return x == 0 && y == 0;
        }
    }
}