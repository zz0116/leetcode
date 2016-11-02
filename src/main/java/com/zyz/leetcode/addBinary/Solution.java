package com.zyz.leetcode.addBinary;

/**
 * Created by ZhangYuanzhuo on 2016/10/31.
 */
public class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        if("0".equals(a)) {
            return b;
        }else if("0".equals(b)) {
            return a;
        }
        String s1, s2;
        if(a.length()>b.length()) {
            s1 = a;
            s2 = b;
        }else {
            s1 = b;
            s2 = a;
        }
        int m = s1.length();
        int n = s2.length();
        int[] sum = new int[m+n];
        int[] a2l = reverse(s1.toCharArray());
        int[] b2l = reverse(s2.toCharArray());
        for(int i=0; i<n; i++) {
            int temp = a2l[i] + b2l[i] + sum[i];
            if(temp<2) {
                sum[i] = temp;
            }else {
                sum[i] = temp - 2;
                sum[i+1] = 1;
            }
        }
        for(int i=n; i<m; i++) {
            int temp = sum[i] + a2l[i];
            if(temp<2) {
                sum[i] = temp;
            }else {
                sum[i] = temp - 2;
                sum[i+1] = 1;
            }
        }
        int tail = sum.length-1;
        while(sum[tail]==0) {
            tail--;
        }
        for(int i=tail; i>=0; i--) {
            res += sum[i];
        }
        return res;
    }

    private int[] reverse(char[] chars) {
        int n = chars.length;
        int[] rev = new int[n];
        for(int i=n-1; i>=0; i--) {
            rev[n-1-i] = chars[i]-'0';
        }
        return rev;
    }
}