package com.zyz.leetcode.wordBreak;

import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/5/23.
 */
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] res = new boolean[n + 1];
        res[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (res[j] && wordDict.contains(s.substring(j, i))) {
                    res[i] = true;
                }
            }
        }
        return res[n];
    }
}