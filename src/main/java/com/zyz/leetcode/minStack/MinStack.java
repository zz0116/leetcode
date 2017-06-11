package com.zyz.leetcode.minStack;

import java.util.Stack;

/**
 * Created by ZhangYuanzhuo on 2017/6/10.
 * 关键在于最小值，push()的时候要比较得到最小值，
 * pop()的时候如果取出了最小值要拿到第二小的值。
 */
public class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */