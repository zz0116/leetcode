package com.zyz.leetcode.reverseVowels;

/**
 * Created by ZhangYuanzhuo on 2017/6/26.
 */
public class Solution {
    public String reverseVowels(String s) {
        if (s == null) return s;
        String vowels = "AEIOUaeiou";
        StringBuilder ret = new StringBuilder(s);

        int i = 0;
        int j = ret.length() - 1;
        while (i < j) {
            char iChar = ret.charAt(i);
            char jChar = ret.charAt(j);
            if (vowels.indexOf(iChar) > -1 && vowels.indexOf(jChar) > -1) {
                ret.setCharAt(i, jChar);
                ret.setCharAt(j, iChar);
                i++;
                j--;
            } else {
                if (vowels.indexOf(iChar) == -1) {
                    i++;
                }
                if (vowels.indexOf(jChar) == -1) {
                    j--;
                }
            }
        }
        return String.valueOf(ret);
    }
}