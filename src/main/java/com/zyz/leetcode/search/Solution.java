package com.zyz.leetcode.search;

/**
 * Created by ZhangYuanzhuo on 2016/11/8.
 */
public class Solution {
    public int search(int[] nums, int target) {
        int minID = 0;
        if (target == nums[0]) {
            return 0;
        }
        for(int i=1; i<nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            if(nums[i]<nums[i-1]) {
                minID = i;
                break;
            }
        }
        if (target > nums[nums.length - 1] || target < nums[minID]) {
            return -1;
        }
        float max = nums.length - 1;
        float min = 0;
        if (target >= nums[minID] && target <= nums[(int) max]) {
            min = minID;
        }
        while (min <= max - 1) {
            float mid = (max + min) / 2;
            if (target >= nums[(int) min] && target <= nums[(int) mid]) {
                max = mid;
            } else if (target >= nums[(int) mid] && target <= nums[(int) max]) {
                min = mid;
            }
        }
        if (nums[(int) min] == target) {
            return (int) min;
        }
        if (nums[(int) max] == target) {
            return (int) max;
        }
        return -1;
    }
}