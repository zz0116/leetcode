package com.zyz.leetcode.addBinary;

/**
 * Created by ZhangYuanzhuo on 2016/10/31.
 */
public class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int m = a.length();
        int n = b.length();
        int max = Math.max(m, n)+1;
        int[] temp = new int[max];
        int i;
//        for(i=0; i<Math.min(m, n); i++) {
//            if((int)a.charAt(m-1-i)+(int)b.charAt(n-1-i)+temp[i]<2) {
//                temp[i] = (int)a.charAt(m-1-i)+(int)b.charAt(n-1-i)+temp[i];
//            }else {
//                temp[i] = (int)a.charAt(m-1-i)+(int)b.charAt(n-1-i)-2;
//                temp[i+1] = 1;
//            }
//        }
//        if(m>n) {
//            while(i<m) {
//                temp[i] += a.charAt(m-1-i);
//                i++;
//            }
//        }else {
//            while(i<n) {
//                temp[i] += b.charAt(n-1-i);
//                i++;
//            }
//        }
//        if(temp[max-1]==1) {
//            res += "1";
//        }
//        for(int j=max-2; j>=0; j--) {
//            res += temp[j];
//        }
        return res;
    }
}