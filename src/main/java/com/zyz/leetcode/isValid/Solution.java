package com.zyz.leetcode.isValid;

import java.util.Stack;

/**
 * Created by ZhangYuanzhuo on 2016/10/8.
 */
public class Solution {
    public boolean isValid(String s) {
        boolean ret = true;
        Stack<Character> stack = new Stack<>();

        char[] s2chars = s.toCharArray();
        for (Character c : s2chars) {
            if ("([{".contains(String.valueOf(c))) {
                stack.push(c);
            } else if (!stack.isEmpty() && isCorr(stack.lastElement(), c)) {
                stack.pop();
            } else {
                ret = false;
            }
        }
        if (!stack.isEmpty()) {
            ret = false;
        }
        return ret;
    }

    public boolean isCorr(Character lastElement, Character c) {
        if (lastElement == '(' && c == ')') {
            return true;
        } else if (lastElement == '[' && c == ']') {
            return true;
        } else if (lastElement == '{' && c == '}') {
            return true;
        }
        return false;
    }
}