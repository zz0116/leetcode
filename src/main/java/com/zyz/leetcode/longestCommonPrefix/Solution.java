package com.zyz.leetcode.longestCommonPrefix;

import java.util.Scanner;

/**
 * Created by Zhang Yuanzhuo on 2016/9/30.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
//        Scanner sc = new Scanner(System.in);
//        final int STRNUM = 3;
//        strs = new String[STRNUM];
        /*读入第一个字符串*/
//        strs[0] = sc.nextLine();
        /*
        for循环比较当前字符串与前一个字符串前n个字符
        得到当前字符串里面共同的元素角标n
        */
        int strNo;

        if(strs.length==0) {
            return "";
        }
        if(strs.length==1) {
            return strs[0];
        }

        int commNo = strs[0].length();
        for(int i=1; i<strs.length; i++) {
            if(strs[i].length()<commNo) {
                commNo = strs[i].length();
            }
        }
        if(commNo==0) {
            return "";
        }

        for(strNo=1; strNo<strs.length; strNo++) {

            for(int n=1; n<=commNo; n++) {
                if(!strs[strNo-1].substring(0, n).equals(strs[strNo].substring(0, n))) {
                    commNo = n-1;
                    break;
                }
            }
        }
        strNo--;

        return strs[strNo].substring(0, commNo);
//        return null;
    }
}