package com.zyz.leetcode.arrayPairSum;

import java.util.Arrays;

/**
 * nums中的数两两成对取最小值，使得和最大
 *
 * @author ZhangYuanzhuo
 * @since 2017/9/1
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        int ret = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            ret += nums[i];
        }

        return ret;
    }
}