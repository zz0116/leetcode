package com.zyz.leetcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        HashMap<Character, char[]> map = new HashMap<>();
        map.put('0', new char[]{'a'});
        map.put('1', new char[]{'b'});
        map.put('2', new char[]{'c'});

        System.out.println(map.values());
    }
}
