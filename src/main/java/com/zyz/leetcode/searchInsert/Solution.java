package com.zyz.leetcode.searchInsert;

/**
 * Created by ZhangYuanzhuo on 2016/10/15.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        if (nums[0] >= target) {
            res = 0;
        }
        if (nums[nums.length - 1] < target) {
            res = nums.length;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < target && nums[i + 1] >= target) {
                res = i + 1;
                break;
            }
        }
        return res;
    }
}