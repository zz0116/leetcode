package com.zyz.leetcode.removeDuplicates;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2016/10/10.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        int duplicate = 0;
        if(nums.length==0) {
            return 0;
        }
        if(nums.length==1) {
            return 1;
        }
//        int temp = 0;
//        for(int i = 1; i < nums.length; i++) {
//            if(nums[i]==nums[i-1]) {
//                temp = i;
//            }
//        }
//        res = nums.length - duplicate;
        return res;
    }
}