package com.zyz.leetcode.threeSumClosest;

import java.util.Arrays;

/**
 * Created by Zhang Yuangzhuo on 2016/10/6.
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        /*
        * 初步想法：
        *   取三个数相加
        *   得到与target差的绝对值
        *   存最小
        * */
        Arrays.sort(nums);

        int plus = nums[0] + nums[1] + nums[nums.length-1];
        int clo = Math.abs(target - plus);

        for(int i=0; i<nums.length-2; i++) {
            if(i!=0 && nums[i]==nums[i-1]) {
                continue;
            }
            int ans = target - nums[i];

            int j = i+1;
            int k = nums.length-1;
            int jkClo;
            while(j<k) {
                jkClo = ans - (nums[j] + nums[k]);
                if(clo>=Math.abs(jkClo)) {
                    clo = Math.abs(jkClo);
                    plus = nums[i] + nums[j] + nums[k];
                }
                if(jkClo>0) {
                    while(j<nums.length-2 && nums[j]==nums[j+1]) {
                        j++;
                    }
                    j++;
                }else if(jkClo<0) {
                    while(k>j+2 && nums[k]==nums[k-1]) {
                        k--;
                    }
                    k--;
                }else {
                    break;
                }
            }
        }
        return plus;
    }
}