package com.zyz.leetcode.maxArea;

/**
 * Created by Zhang Yuanzhuo on 2016/10/2.
 */
public class Solution {
    public int maxArea(int[] height) {
        /*选两条取短的一条
        * 两条横坐标相减乘以短的那条的高
        * @Param l, left bound
        * @Param r, right bound
        * @Param h, heightOfArea = min(l, r)
        * @Param b, base = r - l
        * 主要考察效率
        * */
        if (height.length < 2) {
            return 0;
        }
        int h, b;
        int maxA = 0;
        int l = 0;
        int r = height.length - 1;
        while (r > l) {
            b = r - l;
            if (height[l] < height[r]) {
                h = height[l];
                l++;
            } else {
                h = height[r];
                r--;
            }
            if (maxA < (h * b)) {
                maxA = h * b;
            }
        }
        return maxA;
    }
}
