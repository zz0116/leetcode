package com.zyz.leetcode.rotateArray;

/**
 * Created by ZhangYuanzhuo on 2017/6/12.
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        /*
        * 如果new一个数组或者链表来存的话很简单，
        * 能否不用new空间直接替换到位？
        * */
        k %= nums.length;
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            i++;
            j--;
        }
    }
}