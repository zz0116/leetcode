package com.zyz.leetcode.singleNumber2;

/**
 * Created by ZhangYuanzhuo on 2017/5/20.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int[] binarySum = new int[32];

        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                binarySum[i] += (nums[j] >> i) & 1;
            }
        }

        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += (binarySum[i] % 3) << i;
        }

        return res;
    }
}