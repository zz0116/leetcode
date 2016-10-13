package com.zyz.leetcode.myAtoi;

/**
 * Created by ZhangYuanzhuo on 2016/9/27.
 */
public class Solution {
    public int myAtoi(String str) {
        final int INT_MAX = 2147483647;
        final int INT_MIN = -2147483648;
        final int MAX_LENGTH = 10;

        int i = 0;

        /*去掉开头的空格，中间的不能去*/
        String replace = str.trim();
//        System.out.println(replace);

        /*判断并去掉符号：正、负、无*/
        boolean minus;
        int minusNum = 0;
        int plusNum = 0;

//        计算负号的个数
        char[] chars = replace.toCharArray();
        for (int c = 0; c < chars.length; c++) {
            if ('-' == chars[c]) {
                minusNum++;
                chars[c] = '0';
            }
        }

//        计算正号的个数
        for (int c = 0; c < chars.length; c++) {
            if ('+' == chars[c]) {
                plusNum++;
                chars[c] = '0';
            }
        }

        if (minusNum + plusNum > 1) {
            return i;
        }

        if (minusNum % 2 == 1) {
            minus = true;
        } else {
            minus = false;
        }

//        String substring;
//        if(replace.startsWith("+")) {
//            minus = false;
//            substring = replace.substring(1, replace.length());
//        }else if(replace.startsWith("-")) {
//            minus = true;
//            substring = replace.substring(1, replace.length());
//        }else {
//            minus = false;
//            substring = replace;
//        }
//        System.out.println(minus);
//        System.out.println(substring);

        /*去掉非数字*/
        /*一 转换成字符数组*/
//        char[] chars = substring.toCharArray();
        /*二 将数字装到新字符串里*/
        String s = "";
//        System.out.println(chars);

        /*去掉开头的零*/
        String s1 = "";
        for (char c : chars) {
            if ('0' == c && "".equals(s1)) {

            } else {
                s1 += c;
            }
        }

        char[] chars1 = s1.toCharArray();


        for (char aChar : chars1) {
            if ('0' <= aChar && '9' >= aChar) {
                s += aChar;
            } else {
                break;
            }
        }

//        System.out.println(s);


        /*判断是不是空*/
        if ("".equals(s)) {
            return i;
        }

        /*判断有没有超出int范围*/
        if (s.length() > MAX_LENGTH) {
            if (minus) {
                return INT_MIN;
            }
            return INT_MAX;
        }


        if (s.length() == MAX_LENGTH) {
            if (minus) {
                //            if(s.compareTo(String.valueOf(-INT_MIN))>0) {
                if (s.compareTo(String.valueOf(INT_MIN).replace("-", "")) > 0) {
                    //                System.out.println("2147483648".compareTo(String.valueOf(-INT_MIN).replace("-", "")));
                    //                负号不能直接由-INT_MIN去掉
                    return INT_MIN;
                }
            } else {
                if (s.compareTo(String.valueOf(INT_MAX)) > 0) {

                    return INT_MAX;
                }
//                System.out.println(s);
            }
        }

        /*String转int*/
//        Integer,parseInt()也会遇到溢出问题
        if (minus) {
            i = Integer.parseInt("-" + s);
        } else {
            i = Integer.parseInt(s);
        }


        return i;
    }
}