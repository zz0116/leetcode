package com.zyz.leetcode.intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/6/26.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for (int item1 : nums1) {
            set.add(item1);
        }
        for (int item2 : nums2) {
            if (set.contains(item2)) {
                intersect.add(item2);
            }
        }

        int[] ret = new int[intersect.size()];
        int i = 0;
        for (int item : intersect) {
            ret[i++] = item;
        }
        return ret;
    }
}