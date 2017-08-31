package com.zyz.leetcode.nextPermutation;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ZhangYuanzhuo on 2016/10/14.
 */
public class SolutionTest {
    @Test
    public void nextPermutation() throws Exception {
        Solution solution = new Solution();

        int[] nums = {3, 4, 1};
        solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {6, 3, 5, 4, 3, 2};
        solution.nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1, 2};
        solution.nextPermutation(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {3, 2, 1};
        solution.nextPermutation(nums3);
        System.out.println(Arrays.toString(nums3));
    }

}