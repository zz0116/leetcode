package com.zyz.leetcode.twoSum2;

/**
 * Created by ZhangYuanzhuo on 2017/6/11.
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        if (numbers.length < 2) {
            return ret;
        }

        int left = 0;
        int right = numbers.length - 1;
        int sum;
        while (left < right) {
            sum = numbers[left] + numbers[right];
            if (target == sum) {
                ret[0] = left + 1;
                ret[1] = right + 1;
                break;
            } else if (target > sum) {
                left++;
            } else if (target < sum) {
                right--;
            }
        }
        return ret;
    }
}