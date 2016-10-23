package com.zyz.leetcode.groupAnagrams;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/10/23.
 */
public class SolutionTest {
    @Test
    public void groupAnagrams() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

}