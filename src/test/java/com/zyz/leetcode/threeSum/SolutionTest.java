package com.zyz.leetcode.threeSum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zhang Yuanzhuo on 2016/10/3.
 */
public class SolutionTest {
    @Test
    public void threeSum() throws Exception {
        Solution solution = new Solution();

//        int[] n = {-1,0,1,2,-1,-4};
        int[] n1 = {0,0,0,0};
//        int[] n2 = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
//        int[] n3 = {-4,-8,7,13,10,1,-14,-13,0,8,6,-13,-5,-4,-12,2,-11,7,-5,0,-9,-14,-8,-9,2,-7,-13,-3,13,9,-14,-6,8,1,14,-5,-13,8,-10,-5,1,11,-11,3,14,-8,-10,-12,6,-8,-5,13,-15,2,11,-5,10,6,-1,1,0,0,2,-7,8,-6,3,3,-13,8,5,-5,-3,9,5,-4,-14,11,-8,7,10,-6,-3,11,12,-14,-9,-1,7,5,-15,14,12,-5,-8,-2,4,2,-14,-2,-12,6,8,0,0,-2,3,-7,-14,2,7,12,12,12,0,9,13,-2,-15,-3,10,-14,-4,7,-12,3,-10};
//        int[] n4 = {-6,-8,-9,4,-14,6,-10,7,12,13,4,9,7,14,-12,7,0,14,-1,-3,2,2,-3,11,-6,-10,-13,-13,1,-9,2,2,-2,8,-9,0,-9,-12,14,10,8,3,4,0,-6,7,14,9,6,-2,13,-15,8,-5,3,-13,-8,5,-11,0,11,6,-13,-14,-9,-15,-7,-11,10,-7,14,4,3,3,11,13,-13,11,-1,0,-6,-10,0,9,0,10,11,0,0,-14,-15,-12,-1,10,12,-2,2,-10,2,-2,-10,2,-13,1,12,5,-1,-15,1,5,-8,3,10,8};

//        System.out.println(solution.threeSum(n));
        System.out.println(solution.threeSum(n1));
//        System.out.println(solution.threeSum(n2));
//        System.out.println(solution.threeSum(n3));
//        System.out.println(solution.threeSum(n4));
    }

}