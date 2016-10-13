package com.zyz.leetcode.letterCombinations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhang Yuanzhuo on 2016/10/6.
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        /*
        * 由简单类推的方法找规律
        * 先尝试1个，2个，3个，4个数字的情况帮助思考
        * */
        List<String> ret = new ArrayList<>();

//        String d2l = digit2letter(digits.charAt(0));
//        for(int j=0; j<d2l.length(); j++) {
//            ret.add(""+d2l.charAt(j));
//        }

//        String d2l = digit2letter(digits.charAt(0));
//        String d2l1 = digit2letter(digits.charAt(1));
//        for(int i=0; i<d2l.length(); i++) {
//            for(int j=0; j<d2l1.length(); j++) {
//                ret.add(""+d2l.charAt(i)+d2l1.charAt(j));
//            }
//        }

//        String d2l = digit2letter(digits.charAt(0));
//        String d2l1 = digit2letter(digits.charAt(1));
//        String d2l2 = digit2letter(digits.charAt(2));
//        for(int i=0; i<d2l.length(); i++) {
//            for(int j=0; j<d2l1.length(); j++) {
//                for(int k=0; k<d2l2.length(); k++) {
//                    ret.add(""+d2l.charAt(i)+d2l1.charAt(j)+d2l2.charAt(k));
//                }
//            }
//        }

//        String d2l = digit2letter(digits.charAt(0));
//        String d2l1 = digit2letter(digits.charAt(1));
//        String d2l2 = digit2letter(digits.charAt(2));
//        String d2l3 = digit2letter(digits.charAt(3));
//        for(int i=0; i<d2l.length(); i++) {
//            for(int j=0; j<d2l1.length(); j++) {
//                for(int k=0; k<d2l2.length(); k++) {
//                    for(int l=0; l<d2l3.length(); l++) {
//                        ret.add(""+d2l.charAt(i)+d2l1.charAt(j)+d2l2.charAt(k)+d2l3.charAt(l));
//                    }
//                }
//            }
//        }

        /*
        * 每多一个数字多一层循环
        * 传入的参数为
        *   d2l[i].length()用于指明字母个数，d2l[i]为第i个数字转换的字母串，
        *   stop=digits.length()为迭代次数
        *   j[i]为i,j,k,l
        * */
        if (digits == null || "".equals(digits)) {
            return ret;
        }

        String[] d2l = new String[digits.length()];
        int[] j = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            d2l[i] = digit2letter(digits.charAt(i));
        }
        return d2s(d2l, 0, digits.length(), ret, j);
    }

    public List<String> d2s(String[] d2l, int i, int stop, List<String> ret, int[] j) {
        for (j[i] = 0; j[i] < d2l[i].length(); j[i]++) {
            if (i == stop - 1) {
                String s = "";
                for (int dNo = 0; dNo < stop; dNo++) {
                    s += d2l[dNo].charAt(j[dNo]);
                }
                ret.add(s);
            } else if (i < stop - 1) {
                d2s(d2l, i + 1, stop, ret, j);
            }
        }
        return ret;
    }

    public String digit2letter(char digit) {
        switch (digit) {
            case '0':
                return "";
            case '1':
                return "";
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }
    }
}