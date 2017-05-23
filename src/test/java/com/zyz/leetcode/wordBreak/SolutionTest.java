package com.zyz.leetcode.wordBreak;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2017/5/23.
 */
public class SolutionTest {
    @Test
    public void wordBreak() throws Exception {
        Solution solution = new Solution();
        ArrayList<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");

        System.out.println(solution.wordBreak("leetcode", list));
    }

}