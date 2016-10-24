package com.zyz.leetcode.maxSubArray;

/**
 * Created by ZhangYuanzhuo on 2016/10/23.
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        if(nums.length==1) {
            return max;
        }
        int temp;
        for(int i=1; i<nums.length; i++) {
            temp = res;
            max = Math.max(max+nums[i], nums[i]);
            res = Math.max(max, temp);
        }
        return res;
    }
}