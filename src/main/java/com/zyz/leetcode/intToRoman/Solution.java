package com.zyz.leetcode.intToRoman;

/**
 * Created by Zhang Yuanzhuo on 2016/9/30.
 */
public class Solution {
    public String intToRoman(int num) {
        int k = num / 1000;
        int h = (num % 1000) / 100;
        int t = (num % 100) / 10;
        int i = num % 10;

        String s = "";

        for (int n = 0; n < k; n++) {
            s += mapping(1000);
        }

        if (h < 4) {
            for (int n = 0; n < h; n++) {
                s += mapping(100);
            }
        } else if (h == 4) {
            s += mapping(100);
            s += mapping(500);
        } else if (h < 9) {
            s += mapping(500);
            for (int n = 0; n < h - 5; n++) {
                s += mapping(100);
            }
        } else {
            s += mapping(100);
            s += mapping(1000);
        }

        if (t < 4) {
            for (int n = 0; n < t; n++) {
                s += mapping(10);
            }
        } else if (t == 4) {
            s += mapping(10);
            s += mapping(50);
        } else if (t < 9) {
            s += mapping(50);
            for (int n = 0; n < t - 5; n++) {
                s += mapping(10);
            }
        } else {
            s += mapping(10);
            s += mapping(100);
        }

        if (i < 4) {
            for (int n = 0; n < i; n++) {
                s += mapping(1);
            }
        } else if (i == 4) {
            s += mapping(1);
            s += mapping(5);
        } else if (i < 9) {
            s += mapping(5);
            for (int n = 0; n < i - 5; n++) {
                s += mapping(1);
            }
        } else {
            s += mapping(1);
            s += mapping(10);
        }

        return s;
    }

    public char mapping(int i) {
        switch (i) {
            case 1:
                return 'I';
            case 5:
                return 'V';
            case 10:
                return 'X';
            case 50:
                return 'L';
            case 100:
                return 'C';
            case 500:
                return 'D';
            case 1000:
                return 'M';
        }
        return 0;
    }
}