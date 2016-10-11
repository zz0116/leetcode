package com.zyz.leetcode.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/10/8.
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n==0) {
            return res;
        }
        String item = "";
        helper(n, n, res, item);
        return res;
    }

    public void helper(int left, int right, List<String> res, String item) {
        if(left<right) {
            return;
        }
        if(left==0 && right==0) {
            res.add(item);
            return;
        }
        if(left>0) {
            helper(left-1, right, res, item+')');
        }
        if(right>0) {
            helper(left, right-1, res, item+'(');
        }
    }
}