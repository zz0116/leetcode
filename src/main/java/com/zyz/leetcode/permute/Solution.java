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
        int n = factorial(nums.length, 1);
        while(n-- > 1) {
            helper(nums, res);
        }
        return res;
    }

    public int factorial(int length, int result) {
        if(length==1) {
            return result;
        }
        return factorial(length-1, result*length);
    }

    public void helper(int[] nums, List<List<Integer>> res) {
        for(int i=nums.length-1; i>=0; i--) {
            if(i!=0 && nums[i-1]<nums[i]) {
                for(int j=i; j<nums.length; j++) {
                    if(nums[j]<nums[i-1]) {
                        nums = bubble(swap(nums, i-1, j-1), i);
                        res.add(store(nums));
                        return;
                    }
                    if(j==nums.length-1) {
                        nums = bubble(swap(nums, i-1, j), i);
                        res.add(store(nums));
                        return;
                    }
                }
            }
        }
    }

    public int[] swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }

    public int[] bubble(int[] nums, int i) {
        if(nums.length-1<i+1) {
            return nums;
        }
        boolean swapped;
        do {
            swapped = false;
            for(int p=i+1; p<nums.length; p++) {
                if(nums[p-1]>nums[p]) {
                    swap(nums, p-1, p);
                    swapped = true;
                }
            }
        }while(swapped);
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