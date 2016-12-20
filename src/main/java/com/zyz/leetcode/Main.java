package com.zyz.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list = list1;
        System.out.println(list);
    }
}
