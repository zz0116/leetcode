package com.zyz.leetcode.sortArrayByParity;

/**
 * @author 张远卓
 * @date 2019/5/6
 */
public class Solution {
    public int[] sortArrayByParity(int[] a) {
        int length = a.length;
        int[] res = new int[length];
        int left = 0;
        int right = length - 1;
        for (int n : a) {
            if (n % 2 == 0) res[left++] = n;
            else res[right--] = n;
        }
        return res;
    }
}
