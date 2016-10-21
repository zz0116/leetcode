package com.zyz.leetcode.permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/10/21.
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        res.add(store(nums));
        int n = (int) Math.pow(2, nums.length);
        while(n-- > 1) {
            helper(nums, res);
        }
        return res;
    }

    public void helper(int[] nums, List<List<Integer>> res) {
        for(int i=nums.length-1; i>=0; i--) {
            if(i!=0 && nums[i-1]<nums[i]) {
                for(int j=i; j<nums.length; j++) {
                    if(nums[j]<nums[i-1]) {
                        nums = reverse(nums, i-1, j-1);
                        res.add(store(nums));
                        break;
                    }
                    if(j==nums.length-1) {
                        nums = reverse(nums, i-1, j);
                        res.add(store(nums));
                        break;
                    }
                }
            }
        }
    }

    public int[] reverse(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        for(int p=i+1; p<nums.length; p++) {
            for(int q=p+1; q<nums.length; q++) {
                if(nums[p]>nums[q]) {

                }
            }
        }
        return nums;
    }

    public List<Integer> store(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        return list;
    }
}