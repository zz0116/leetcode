package com.zyz.leetcode.isPalindrome;

/**
 * Created by ZhangYuanzhuo on 2016/9/29.
 */

/*
Determine whether an integer is a palindrome. Do this without extra space.

        Some hints:

        Could negative integers be palindromes? (ie, -1)

        If you are thinking of converting the integer to string,
        note the restriction of using extra space.

        You could also try reversing an integer.
        However, if you have solved the problem "Reverse Integer",
        you know that the reversed integer might overflow.
        How would you handle such case?

        There is a more generic way of solving this problem.
*/

public class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        String ret = new String();

        if('-' == chars[0]) {
            return false;
        }else {
            for(int j=1; j<=chars.length; j++) {
                ret += chars[chars.length-j];
            }
        }

        long result = Long.parseLong(ret);
        if(result<-2147483648||result>2147483647) {
            return false;
        }

        if(x==result) {
            return true;
        }
        return false;
    }
}