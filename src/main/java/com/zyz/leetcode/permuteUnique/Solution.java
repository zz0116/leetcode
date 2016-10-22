package com.zyz.leetcode.permuteUnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/10/22.
 */
public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] isUsed = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        helper(nums, isUsed, list, res);

        return res;
    }

    private void helper(int[] nums, boolean[] isUsed, List<Integer> list, List<List<Integer>> res) {
        if(list.size()==nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0; i<nums.length; i++) {
            if(i>0 && !isUsed[i-1] && nums[i-1]==nums[i]) {
                continue;
            }
            if(!isUsed[i]) {
                isUsed[i] = true;
                list.add(nums[i]);
                helper(nums, isUsed, list, res);
                list.remove(list.size()-1);
                isUsed[i] = false;
            }
        }
    }
}