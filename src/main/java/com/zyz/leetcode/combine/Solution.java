package com.zyz.leetcode.combine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/11/7.
 */
public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        selectOne(n, k, 1, 1, list, res);
        return res;
    }

    private void selectOne(int n, int k, int loc, int start, List<Integer> list, List<List<Integer>> res) {
        if(loc<=k) {
            for(int i=start; i<=n-k+loc; i++) {
                if(list.contains(i)) {
                    continue;
                }
                list.add(i);
                selectOne(n, k, loc+1, i, list, res);
                if(list.size()==k) {
                    res.add(new ArrayList<>(list));
                }
                list.remove(list.size()-1);
            }
        }
    }
}