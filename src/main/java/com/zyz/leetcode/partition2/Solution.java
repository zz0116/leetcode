package com.zyz.leetcode.partition2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/12/31.
 */
public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s == null)
            return res;
        List<String> item = new ArrayList<>();
        helper(s, item, res, 0);
        return res;
    }

    private void helper(String s, List<String> item, List<List<String>> res, int begin) {
        if (begin == s.length()) {
            res.add(new ArrayList<>(item));
            return;
        }
        for (int end = begin + 1; end <= s.length(); end++) {
            String part = s.substring(begin, end);
            if (isPalindrome(part)) {
                item.add(part);
                helper(s, item, res, end);
                item.remove(item.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right))
                return false;
        }
        return true;
    }
}