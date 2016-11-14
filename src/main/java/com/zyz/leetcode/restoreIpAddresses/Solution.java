package com.zyz.leetcode.restoreIpAddresses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2016/11/13.
 */
public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        List<String> item = new ArrayList<>();
        helper(s, res, item, 0, 0);
        return res;
    }

    private void helper(String s, List<String> res, List<String> item, int index, int part) {
        if (part > 4) {
            return;
        }
        if (index == s.length()) {
            if (part == 4) {
                String address = "";
                for (int i = 0; i < 3; i++) {
                    address += item.get(i) + ".";
                }
                address += item.get(3);
                res.add(address);
            }
            return;
        }
        if (index < s.length() - 2) {
            if (s.charAt(index) != '0') {
                int temp = Integer.valueOf(s.substring(index, index + 3));
                if (temp < 256) {
                    item.add(s.substring(index, index + 3));
                    helper(s, res, item, index + 3, part + 1);
                    item.remove(item.size() - 1);
                }
            }
        }
        if (index < s.length() - 1) {
            if (s.charAt(index) != '0') {
                item.add(s.substring(index, index + 2));
                helper(s, res, item, index + 2, part + 1);
                item.remove(item.size() - 1);
            }
        }
        if (index < s.length()) {
            item.add(s.substring(index, index + 1));
            helper(s, res, item, index + 1, part + 1);
            item.remove(item.size() - 1);
        }
    }
}