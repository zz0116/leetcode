package com.zyz.leetcode.convert;

/**
 * Created by ZhangYuanzhuo on 2016/9/26.
 */
public class Solution {
    public String convert(String s, int numRows) {
        String res = "";
        int cycle = 2*numRows-2;
        int loopNo = 0;
        /*第一排*/
        if(cycle==0) {
            return s;
        }
        while(loopNo*cycle<s.length()) {
            res += s.charAt(loopNo*cycle);
            loopNo++;
        }
        /*中间排*/
        for(int r = 1; r<numRows-1; r++) {
            loopNo = 0;
            while(true) {
                if(loopNo*cycle+r>s.length()-1) {
                    break;
                }
                res += s.charAt(loopNo*cycle+r);
                if(loopNo*cycle+r+(cycle-2*r)>s.length()-1) {
                    break;
                }
                res += s.charAt(loopNo*cycle+r+(cycle-2*r));
                loopNo++;
            }
        }
        /*最后排*/
        loopNo = 0;
        while(loopNo*cycle+numRows-1<s.length()) {
            res += s.charAt(loopNo*cycle+numRows-1);
            loopNo++;
        }
        return res;
    }
}