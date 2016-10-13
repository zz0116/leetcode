package com.zyz.leetcode.removeDuplicates;

/**
 * Created by ZhangYuanzhuo on 2016/10/10.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = 1;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[j++] = nums[i];
                res++;
            }
        }
        return res;
    }
}