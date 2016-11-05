package com.zyz.leetcode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "abc/def/g";
        String[] split = s.split("/+");
        String[] split1 = s.split("/");

        System.out.println(Arrays.equals(split, split1));
    }
}
