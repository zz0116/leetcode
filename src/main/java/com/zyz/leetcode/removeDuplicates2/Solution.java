package com.zyz.leetcode.removeDuplicates2;

/**
 * Created by ZhangYuanzhuo on 2016/11/8.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int selfcnt = 1;
        int res = 0;
        for(int p=1; p<nums.length; p++) {
            if(nums[p]==nums[p-1]) {
                selfcnt++;
                nums[res+selfcnt-1] = nums[p];
            }else {
                res += selfcnt>2?2:selfcnt;
                selfcnt = 1;
                nums[res] = nums[p];
            }
        }
        res += selfcnt>2?2:selfcnt;
        return res;
    }
}