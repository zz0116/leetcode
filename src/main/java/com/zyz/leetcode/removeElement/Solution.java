package com.zyz.leetcode.removeElement;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2016/10/12.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        if(nums.length==0) {
            return 0;
        }
        int j = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=val) {
                nums[j] = nums[i];
                j++;
                res++;
            }
        }
        return res;
    }
}