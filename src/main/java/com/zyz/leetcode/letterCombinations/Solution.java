package com.zyz.leetcode.letterCombinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Zhang Yuangzhuo on 2016/10/6.
 */
public class Solution {
    public List<String> letterCombinations(String digits) {
        /*
        * 两个问题：
        *   1. 数字和字母如何对应
        *   2. 取出字母如何存取
        * */
        List<String> ret = new ArrayList<>();
        char[] s2c = digits.toCharArray();

        HashMap<Character, char[]> map = new HashMap<>();
        map.put('0', new char[]{});
        map.put('1', new char[]{});
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'y', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});


        return null;
    }
}