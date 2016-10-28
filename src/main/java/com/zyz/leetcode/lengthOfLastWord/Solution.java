package com.zyz.leetcode.lengthOfLastWord;

/**
 * Created by ZhangYuanzhuo on 2016/10/27.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)==' ') {
                if(res!=0) {
                    break;
                }else {
                    continue;
                }
            }
            res++;
        }
        return res;
    }
}