package com.zyz.leetcode.longestPalindrome;

/**
 * Created by Zhang Yuangzhuo on 2016/10/1.
 */
public class Solution {
    public String longestPalindrome(String s) {
        if("".equals(s)) {
            return "";
        }
        if(s.length()==1) {
            return s;
        }

        /*转换成字符数组*/
        char[] s2c = s.toCharArray();
        /*
        * 得到一个片段：
        * 由最长的片段开始
        * 首尾对比
        * 是回文，
        *   角标i,j置入两个整型数组h[],t[]
        *   p=t-h
        *   tail--的循环就不用继续了
        *   head++的循环也只做到tail-head<p
        * 不是回文，
        *   回到tail--循环，直到tail-head<p
        *   回到head++循环，直到tail-head<p
        * @Param j-->t[], tail of the slice
        * @Param i-->h[], head of the slice
        * */
        int i,j;
        int[] h = new int[50];
        int h_i = 0;
        int[] t = new int[50];
        int t_i = 0;
        int[] p = new int[50];
        int p_i = 0;

        boolean isPLD;
        for(i=0; i<s2c.length; i++) {
            if(p[0]!=0 && s2c.length-1-i <= p[p_i-1]) {
                break;
            }
            for(j=s2c.length-1; j>i; j--) {
                if (p[0]!=0 && j-i <= p[p_i-1]) {
                    break;
                }

                isPLD = true;
                int m = i;
                int n = j;
                Slice:
                for (; m <= (j - i) / 2 + i; m++, n--) {
                    if (s2c[m] != s2c[n]) {
                        isPLD = false;
                        break Slice;
                    }
                }
                if (isPLD) {
                    h[h_i] = i;
                    h_i++;
                    t[t_i] = j;
                    t_i++;
                    p[p_i] = j - i;
                    p_i++;
                }
            }
        }
        return s.substring(h[h_i-1], t[t_i-1]+1);
    }
}
