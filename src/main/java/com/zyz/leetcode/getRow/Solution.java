package com.zyz.leetcode.getRow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/12/20.
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        if (rowIndex == 0)
            return pre;
        pre.add(1);
        if (rowIndex == 1)
            return pre;
        for (int row = 2; row <= rowIndex; row++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int i = 1; i < row; i++) {
                cur.add(pre.get(i - 1) + pre.get(i));
            }
            cur.add(1);
            pre = cur;
        }
        return pre;
    }
}