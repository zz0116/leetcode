package com.zyz.leetcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        stack.push('a');
        stack.push('c');
        stack.push('b');

        System.out.println(stack.pop());
        System.out.println(stack.lastElement());
        System.out.println(stack.peek());
        System.out.println(stack.firstElement());
        System.out.println(stack.search('a'));
        System.out.println(stack.search('b'));
        System.out.println(stack.search('c'));
        System.out.println(stack.add('x'));
        System.out.println(stack.peek());
        System.out.println(stack.capacity());
        System.out.println(stack.size());
        stack.setSize(20);
        System.out.println(stack.capacity());
    }
}
