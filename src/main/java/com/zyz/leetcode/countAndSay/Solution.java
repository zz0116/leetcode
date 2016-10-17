package com.zyz.leetcode.countAndSay;

/**
 * Created by ZhangYuanzhuo on 2016/10/16.
 */
public class Solution {
    public String countAndSay(int n) {
        String res = "";
        String s = "1";

        return helper(s, n);

    }
    public String helper(String s, int n) {
        while(--n!=0) {
            String read = "";
            for(int i=0; i<s.length(); i++) {
                int count = 1;
                while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
                    count++;
                    i++;
                }
                read += String.valueOf(count) + s.charAt(i);
            }
            s = read;
        }
        return s;
    }
}