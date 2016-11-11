package com.zyz.leetcode.grayCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/11/11.
 */
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        int last;
        for (int i = 0; i < n; i++) {
            last = res.size();
            while (last-- > 0) {
                res.add((int) (Math.pow(2, i) + res.get(last)));
            }
        }
        return res;
    }
}