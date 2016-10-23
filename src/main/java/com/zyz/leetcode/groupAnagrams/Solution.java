package com.zyz.leetcode.groupAnagrams;

import java.util.*;

/**
 * Created by ZhangYuanzhuo on 2016/10/23.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, ArrayList> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            char[] s2chars = strs[i].toCharArray();
            Arrays.sort(s2chars);
            String str = String.valueOf(s2chars);
            if(!map.containsKey(str)) {
                map.put(str, new ArrayList<Integer>());
            }
            map.get(str).add(strs[i]);
        }
        for(ArrayList arrayList : map.values()) {
            res.add(arrayList);
        }
        return res;
    }

}