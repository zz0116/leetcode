package com.zyz.leetcode.exist;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/11/7.
 */
public class SolutionTest {
    @Test
    public void exist() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
        System.out.println(solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
        System.out.println(solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
        System.out.println(solution.exist(new char[][]{{'a', 'a'}}, "a"));
    }

}