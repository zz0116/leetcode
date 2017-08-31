package com.zyz.leetcode.combinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/10/19.
 */
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(candidates, 0, list, target, res);

        for(int i=0; i<res.size(); i++) {
            for(int j=res.size()-1; j>i; j--) {
                boolean isRepeat = true;
                for(int k=0; k<res.get(i).size(); k++) {
                    if(!res.get(j).get(k).equals(res.get(i).get(k))) {
                        isRepeat = false;
                        break;
                    }
                }
                if(isRepeat) {
                    res.remove(j);
                }
            }
        }
        return res;
    }
    public void helper(int[] candidates, int start, List<Integer> list, int target, List<List<Integer>> res) {
        if(target==0) {
            res.add(new ArrayList<Integer>(list));
            return;
        }
        if(target<0) {
            return;
        }
        for(int i=start; i<candidates.length; i++) {
            list.add(candidates[i]);
            helper(candidates, i+1, list, target-candidates[i], res);
            list.remove(list.size()-1);
        }
    }
}
