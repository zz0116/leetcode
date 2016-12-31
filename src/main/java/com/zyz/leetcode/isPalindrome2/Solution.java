package com.zyz.leetcode.isPalindrome2;

/**
 * Created by ZhangYuanzhuo on 2016/12/27.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        if (right < 1)
            return true;
        while (left < right) {
            while (left < s.length() && !isValid(s.charAt(left)))
                left++;
            if (left == s.length())
                return true;
            while (right >= 0 && !isValid(s.charAt(right)))
                right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    private boolean isValid(char c) {
        return Character.isDigit(c) || Character.isLetter(c);
    }
}