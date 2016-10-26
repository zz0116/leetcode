package com.zyz.leetcode.canJump;

/**
 * Created by ZhangYuanzhuo on 2016/10/25.
 */
public class Solution {
    public boolean canJump(int[] nums) {
        boolean res = false;
        if(nums.length<2) {
            return true;
        }
        int jMax = nums[0];
        for(int i=1; i<nums.length-1; i++) {
            if(jMax>0) {
                jMax = Math.max(jMax-1, nums[i]);
            }else {
                break;
            }
        }
        if(jMax>0) {
            res = true;
        }
        return res;
    }
}