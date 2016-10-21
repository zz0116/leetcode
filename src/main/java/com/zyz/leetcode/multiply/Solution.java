package com.zyz.leetcode.multiply;

/**
 * Created by ZhangYuanzhuo on 2016/10/20.
 */
public class Solution {
    public String multiply(String num1, String num2) {
        String res = "";
        int l1 = num1.length();
        int l2 = num2.length();
        int[] result = new int[l1+l2];
        int[] digit1 = new int[l1];
        int[] digit2 = new int[l2];
        for(char c1 : num1.toCharArray()) {
            digit1[--l1] = c1 - '0';
        }
        for(char c2 : num2.toCharArray()) {
            digit2[--l2] = c2 - '0';
        }
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<=i; j++) {
                if(j<digit1.length && i-j<digit2.length) {
                    result[i] += digit1[j] * digit2[i-j];
                }
            }
            if(result[i]>=10) {
                result[i+1] += result[i]/10;
                result[i] %= 10;
            }
        }
        for(int i=result.length-1; i>=0; i--) {
            if(result[i]==0 && res.length()==0) {
                continue;
            }
            res += result[i];
        }
        if(res.length()==0) {
            res = "0";
        }
        return res;
    }
}