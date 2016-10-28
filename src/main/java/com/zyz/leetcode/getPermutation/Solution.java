package com.zyz.leetcode.getPermutation;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2016/10/27.
 */
public class Solution {
    public String getPermutation(int n, int k) {
        String res = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            list.add(i);
        }
        k--;
        for(int nFac=0; n>1; n--) {
            nFac = factorial(n-1);
            for(int i=0; i<n; i++) {
                if(k>=i*nFac && k<(i+1)*nFac) {
                    res += list.get(i);
                    list.remove(i);
                    k -= i*nFac;
                    break;
                }
            }
        }
        res += list.get(0);
        return res;
    }

    private int factorial(int n) {
        int fac = 1;
        for(int i=1; i<=n; i++) {
            fac *= i;
        }
        return fac;
    }
}