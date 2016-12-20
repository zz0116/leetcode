package com.zyz.leetcode.generate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/12/20.
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        if (numRows == 0)
            return res;
        pre.add(1);
        res.add(new ArrayList<>(pre));
        if (numRows == 1)
            return res;
        pre.add(1);
        res.add(new ArrayList<>(pre));
        if (numRows == 2)
            return res;
        for (int row = 2; row < numRows; row++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int i = 1; i < row; i++) {
                cur.add(pre.get(i - 1) + pre.get(i));
            }
            cur.add(1);
            res.add(cur);
            pre = cur;
        }
        return res;
    }
}