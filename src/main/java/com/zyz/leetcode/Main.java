package com.zyz.leetcode;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Integer> ints = new TreeSet<>();
        ints.add(8);
        ints.add(3);
        ints.add(2);
        ints.add(4);
        ints.add(6);

        System.out.println(ints.first());
    }
}
