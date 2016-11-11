package com.zyz.leetcode.merge;

/**
 * Created by ZhangYuanzhuo on 2016/11/10.
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i, j;
        for (j = 0; j < n; j++) {
            for (i = m + j - 1; i > -1 && nums2[j] < nums1[i]; i--) {
                nums1[i + 1] = nums1[i];
            }
            nums1[i + 1] = nums2[j];
        }
    }
}