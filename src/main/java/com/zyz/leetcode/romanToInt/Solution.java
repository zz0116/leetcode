package com.zyz.leetcode.romanToInt;

/**
 * Created by Zhang Yuanzhuo on 2016/9/30.
 */
public class Solution {
    public int romanToInt(String s) {
        if("".equals(s)) {
            return 0;
        }

        char[] s2chars = s.toCharArray();
        int[] c2int = new int[s2chars.length];

        c2int[0] = mapping(s2chars[0]);
        if(c2int.length==1) {
            return c2int[0];
        }

        int sum = c2int[0];
        for(int i=1; i<s2chars.length; i++) {
            c2int[i] = mapping(s2chars[i]);
            if(c2int[i]>c2int[i-1] && (c2int[i-1] == 1 ||c2int[i-1] == 10 ||c2int[i-1] == 100)) {
                sum = sum + c2int[i] - 2*c2int[i-1];
            }else {
                sum += c2int[i];
            }
        }
        return sum;
    }

    public int mapping(char c) {
        switch(c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}