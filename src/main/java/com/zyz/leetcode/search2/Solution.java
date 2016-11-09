package com.zyz.leetcode.search2;

/**
 * Created by ZhangYuanzhuo on 2016/11/8.
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        int minID = 0;
        if (target == nums[0]) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i]) {
                return true;
            }
            if (nums[i] < nums[i - 1]) {
                minID = i;
                break;
            }
        }
        if (target > nums[nums.length - 1] || target < nums[minID]) {
            return false;
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
        return nums[(int) min] == target || nums[(int) max] == target;
    }
}