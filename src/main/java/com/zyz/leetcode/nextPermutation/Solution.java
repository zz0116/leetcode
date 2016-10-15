package com.zyz.leetcode.nextPermutation;

/**
 * Created by ZhangYuanzhuo on 2016/10/14.
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] <= nums[i - 1]) {
                        reverse(i - 1, j - 1, nums);
                        break;
                    }
                    if (j == nums.length - 1) {
                        reverse(i - 1, j, nums);
                    }
                }
                break;
            }
        }
        bubble(i, nums);
    }

    public void reverse(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void bubble(int i, int[] nums) {
        boolean swapped;
        do {
            swapped = false;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}