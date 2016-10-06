package com.zyz.leetcode.threeSumClosest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Zhang Yuangzhuo on 2016/10/6.
 */
public class SolutionTest {
    @Test
    public void threeSumClosest() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.threeSumClosest(new int[]{0, 0, 0}, 1));
        System.out.println(solution.threeSumClosest(new int[]{1,1,-1,-1,3}, -1));
        System.out.println(solution.threeSumClosest(new int[]{1,1,1,0}, 100));
        System.out.println(solution.threeSumClosest(new int[]{1,1,1,0}, -100));
        System.out.println(solution.threeSumClosest(new int[]{-65,-46,-10,-79,-86,39,40,62,31,-40,-80,-20,-6,8,38,-33,97,-99,-86,8,85,57,78,-92,10,5,84,-15,32,11,-15,-5,-56,86,47,-78,39,88,-86,24,-77,52,-55,16,22,-57,-39,-16,-32,-2,-94,-43,13,-49,77,96,35,-46,-47,10,-57,-73,95,-22,-22,5,-3,81,79,-15,-34,41,-91,26,-15,72,35,100,100,-89,-79,70,8,-99,-45,75,-57,15,34,-16,43,54,-99,39,-42,87,-88,-69,39,15,12,29,71,48,-51,20,-18,-37,95,-81,-71,22,56,-87,90,78,-57,-37,-17,-64,82,-28,-25,-83,75,21,97,35,67,12,55,-91,-63,4,-46,15,-19,-60,41,29,-71,26,25,-85,-15,-81,-53,48,31,28,88,-71,19,83,38,-42,-94,42,62,-43,90,-81,-60,56,-47,34,-60,73,-67,72,-99,-46,-47,10,46,-86,-42}, 220));

    }

}