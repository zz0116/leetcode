package com.zyz.leetcode.removeOuterParentheses;

/**
 * @author 张远卓
 * @create 2019/4/18 18:02
 * @description 去掉外层括号，当前答案水平如下：
 * Runtime: 5 ms, faster than 45.26% of Java online submissions for Remove Outermost Parentheses.
 * Memory Usage: 37.5 MB, less than 100.00% of Java online submissions for Remove Outermost Parentheses.
 */
public class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int delete = 0;
        int left = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character cur = chars[i];
            if ('(' == cur) {
                count++;
            } else {
                count--;
            }
            if (count == 0 && sb.length() != 0) {
                sb.deleteCharAt(left);
                delete += 2;
                left = i + 1 - delete;
            } else {
                sb.append(cur);
            }
        }
        return sb.toString();
    }
}
