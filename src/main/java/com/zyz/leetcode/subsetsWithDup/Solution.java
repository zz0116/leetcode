package com.zyz.leetcode.subsetsWithDup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/11/11.
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        res.add(new ArrayList<>(list));
        helper(res, list, nums, 0);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int start) {
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            if (!res.contains(list)) {
                res.add(new ArrayList<>(list));
            }
            helper(res, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}