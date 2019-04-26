package com.zyz.leetcode.numUniqueEmails;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author 张远卓
 * @create 2019/4/25 19:31
 * @description AC评价如下
 * Runtime: 11 ms, faster than 93.42% of Java online submissions for Unique Email Addresses.
 * Memory Usage: 39.6 MB, less than 71.05% of Java online submissions for Unique Email Addresses.
 */
public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new TreeSet<>();
        for (String email : emails) {
            char[] chars = email.toCharArray();
            StringBuilder sb = new StringBuilder();
            boolean add = false;
            boolean at = false;
            for (char c : chars) {
                if ('+' == c) {
                    add = true;
                } else if ('@' == c) {
                    at = true;
                    add = false;
                    sb.append(c);
                }
                if (at) {
                    sb.append(c);
                } else {
                    if (!add && '.' != c) {
                        sb.append(c);
                    }
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
