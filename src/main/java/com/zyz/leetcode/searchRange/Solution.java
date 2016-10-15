package com.zyz.leetcode.searchRange;

/**
 * Created by ZhangYuanzhuo on 2016/10/15.
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        boolean left = false;
        boolean right = false;
        for (int i = 0, j = nums.length - 1; i <= j; ) {
            if (right && left) {
                break;
            }
            if (!left) {
                if (nums[i] > target) {
                    left = false;
                    break;
                } else if (nums[i] < target) {
                    i++;
                } else if (nums[i] == target) {
                    res[0] = i;
                    left = true;
                }
            }
            if (!right) {
                if (nums[j] < target) {
                    right = false;
                    break;
                } else if (nums[j] > target) {
                    j--;
                } else if (nums[j] == target) {
                    res[1] = j;
                    right = true;
                }
            }
        }
        if (right && left) {
            return res;
        } else {
            return new int[]{-1, -1};
        }
    }
}