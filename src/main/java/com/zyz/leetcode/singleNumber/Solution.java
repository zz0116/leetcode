package com.zyz.leetcode.singleNumber;

/**
 * Created by ZhangYuanzhuo on 2017/5/20.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;

        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
