package com.zyz.leetcode.twoSum;

/**
 * Created by ZhangYuanzhuo on 2016/9/26.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if(nums[i]+nums[j]==target) {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
