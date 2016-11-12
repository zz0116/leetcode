package com.zyz.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list0.add(1);
        list0.add(2);
        res.add(new ArrayList<>(list0));
        list0.remove(1);
        list0.add(2);

        System.out.println(res.contains(list0));
    }
}
