package com.zyz.leetcode.repeatedNTimes;

import java.util.TreeSet;

/**
 * @author 张远卓
 * @date 2019/5/6
 */
public class Solution {
    public int repeatedNTimes(int[] a) {
        /*
        是不是用Set导致这道题变容易？
        Set底层每次增加一个元素是不是会把所有元素遍历看是否重复？
            HashSet底层用的HashMap，不需要遍历
            TreeSet底层使用TreeMap
         */
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            int ai = a[i];
            set.add(ai);
            if (set.size() != i + 1) {
                return ai;
            }
        }
        return a[a.length - 1];
    }
}
