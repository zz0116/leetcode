package com.zyz.leetcode;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "";
        List<String> ret = new LinkedList<>();

        s += "2";
        s += '2';
        s += 'c';
        s += "c";
        s += 'c';

        ret.add(s);
        ret.get(0);

        String s1 = new String(s);
        s1 += "d";

        System.out.println(s);
        System.out.println(s.length()-s.replace("c","").length());
        System.out.println(s);
        System.out.println(ret);
        System.out.println(s1);
    }
}
