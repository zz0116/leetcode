package com.zyz.leetcode.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/10/8.
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-3; i++) {
            if(i!=0 && nums[i]==nums[i-1]) {
                continue;
            }
            for(int j=i+1; j<nums.length-2; j++) {
                if(nums[j]==nums[j-1] && (j-1)!=i) {
                    continue;
                }
                int k = j+1;
                int l = nums.length-1;
                while(k<l) {
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        ret.add(list);
                        k++;
                        while(k<l && nums[k]==nums[k-1] && (k-1)!=j) {
                            k++;
                        }
                    }else if(sum<target) {
                        k++;
                        while(k<l && nums[k]==nums[k-1] && (k-1)!=j) {
                            k++;
                        }
                    }else {
                        l--;
                        while(l>k && l<nums.length-1 && nums[l]==nums[l+1]) {
                            l--;
                        }
                    }
                }
            }
        }

        for(int i=0; i<ret.size()-1; i++) {
            for(int j=ret.size()-1; j>i; j--) {
                if(ret.get(i).get(0)==ret.get(j).get(0) && ret.get(i).get(1)==ret.get(j).get(1) && ret.get(i).get(2)==ret.get(j).get(2)) {
                    ret.remove(j);
                }
            }
        }

        return ret;
    }
}