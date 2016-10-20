package com.zyz.leetcode.combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/10/17.
 */
public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        helper(candidates, 0, target, list, res);
        return res;
    }
    public void helper(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> res) {
        for(int i=start; i<candidates.length; i++) {
            if(target<0) {
                return;
            }
            if(target==0) {
                res.add(new ArrayList<Integer>(list));
                return;
            }
            if(target>0) {
                list.add(candidates[i]);
                helper(candidates, i, target-candidates[i], list, res);
                list.remove(list.size()-1);
            }
        }
    }
}