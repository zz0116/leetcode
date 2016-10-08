package com.zyz.leetcode.fourSum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ZhangYuanzhuo on 2016/10/8.
 */
public class SolutionTest {
    @Test
    public void fourSum() throws Exception {
        Solution solution = new Solution();

//        System.out.println(solution.fourSum(new int[]{-497, -494, -484, -477, -453, -453, -444, -442, -428, -420, -401, -393, -392, -381, -357, -357, -327, -323, -306, -285, -284, -263, -262, -254, -243, -234, -208, -170, -166, -162, -158, -136, -133, -130, -119, -114, -101, -100, -86, -66, -65, -6, 1, 3, 4, 11, 69, 77, 78, 107, 108, 108, 121, 123, 136, 137, 151, 153, 155, 166, 170, 175, 179, 211, 230, 251, 255, 266, 288, 306, 308, 310, 314, 321, 322, 331, 333, 334, 347, 349, 356, 357, 360, 361, 361, 367, 375, 378, 387, 387, 408, 414, 421, 435, 439, 440, 441, 470, 492}, 1682));
//        System.out.println(solution.fourSum(new int[]{-4,0,-4,2,2,2,-2,-2}, 7));
//        System.out.println(solution.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
        System.out.println(solution.fourSum(new int[]{0,0,0,0}, 0));
    }

}