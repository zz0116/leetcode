package com.zyz.leetcode.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/11/7.
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        res.add(new ArrayList<>(list));
        helper(n, nums, 0, 0, list, res);
        return res;
    }

    private void helper(int n, int[] nums, int start, int loc, List<Integer> list, List<List<Integer>> res) {
        if(loc<n) {
            for(int i=start; i<n; i++) {
                if(list.contains(nums[i])) {
                    continue;
                }
                list.add(nums[i]);
                helper(n, nums, i+1, loc+1, list, res);
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
            }
        }
    }
}