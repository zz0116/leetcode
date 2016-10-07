package com.zyz.leetcode.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by Zhang Yuanzhuo on 2016/10/3.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*优化算法问题*/
        /*挑n个数，使之和为target*/
        final int N = 3;
        final int TARGET = 0;

        /*先对nums里面的数字进行排序*/
        Arrays.sort(nums);
        /*初始化一个装结果的容器*/
        List<List<Integer>> lists = new ArrayList<>();
        if(nums.length<N) {
            return lists;
        }
        /*O(3n)估计不行，确实*/

        /*去头元素nums[i]，后面两个两头查*/
        for(int i=0; i<nums.length-2; i++) {
            /*去重*/
            if(i!=0 && nums[i]==nums[i-1]) {
                continue;
            }

            int ans = TARGET - nums[i];

            int j = i+1;
            int k = nums.length-1;
            while(j<k) {
                if(nums[j]+nums[k]==ans) {
                    lists.add(ret(nums[i], nums[j], nums[k]));
                    while(j<nums.length-2 && nums[j]==nums[j+1]) {
                        j++;
                    }
                    j++;
                    continue;
                } else if(nums[j]+nums[k]<ans) {
                    while(j<nums.length-2 && nums[j]==nums[j+1]) {
                        j++;
                    }
                    j++;
                    continue;
                } else if(nums[j]+nums[k]>ans) {
                    while(k<nums.length-1 && nums[k]==nums[k-1]) {
                        k--;
                    }
                    k--;
                    continue;
                }
            }
        }
        return lists;
    }

    public List<Integer> ret(int numi, int numj, int numk) {
        List<Integer> ret = new ArrayList<>();

        ret.add(numi);
        ret.add(numj);
        ret.add(numk);
        return ret;
    }
}