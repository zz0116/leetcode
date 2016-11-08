package com.zyz.leetcode.search;

/**
 * Created by ZhangYuanzhuo on 2016/11/8.
 */
public class Solution {
    public int search(int[] nums, int target) {
        int minID = 0;
        int maxID = nums.length-1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]<nums[i-1]) {
                minID = i;
                maxID = i-1;
                break;
            }
        }
        if(target>=nums[0] && target<=nums[maxID]) {
            float max = maxID;
            float min = 0;
            while(min<=max-1) {
                float mid = (max + min) / 2;
                if(target>=nums[(int) min] && target<=nums[(int) mid]) {
                    max = mid;
                }else if(target>=nums[(int) mid] && target<=nums[(int) max]) {
                    min = mid;
                }
            }
            if(nums[(int) min]==target) {
                return (int) min;
            }
            if(nums[(int) max]==target) {
                return (int) max;
            }
        }
        return -1;
    }
}