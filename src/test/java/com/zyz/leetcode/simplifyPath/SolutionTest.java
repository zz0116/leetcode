package com.zyz.leetcode.simplifyPath;

import org.junit.Test;

/**
 * Created by ZhangYuanzhuo on 2016/11/3.
 */
public class SolutionTest {
    @Test
    public void simplifyPath() throws Exception {
        Solution solution = new Solution();

        System.out.println(solution.simplifyPath("/home/"));
        System.out.println(solution.simplifyPath("/a/./b/../../c/"));
        System.out.println(solution.simplifyPath("/"));
        System.out.println(solution.simplifyPath("/."));
        System.out.println(solution.simplifyPath("/.."));
        System.out.println(solution.simplifyPath("/..."));
        System.out.println(solution.simplifyPath("/./"));
        System.out.println(solution.simplifyPath("/../"));
        System.out.println(solution.simplifyPath("/.../"));
        System.out.println(solution.simplifyPath("/..aa/...hidden/"));
        System.out.println(solution.simplifyPath("///"));
    }

}