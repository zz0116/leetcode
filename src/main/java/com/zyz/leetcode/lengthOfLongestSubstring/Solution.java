package com.zyz.leetcode.lengthOfLongestSubstring;

import java.util.*;

/**
 * Created by Zhang Yuanzhuo on 2016/10/1.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if("".equals(s)) {
            return 0;
        }
        if(s.length()==1) {
            return 1;
        }
        /*转换成字符数组*/
        char[] s2c = s.toCharArray();
        /*
        截取一段，这一段里面所有字符对比
        是否有相同字符
        若有，则break，进行下一轮截取
        记录截取的最大长度
        */
        boolean unique;
        TreeSet<Integer> ret = new TreeSet<>();
        ret.add(1);
        for(int i=0; i<s2c.length-1; i++) {
            Slice:
            for(int j=i+ret.last(); j<s2c.length; j++) {

                unique = true;
                for(int p=i; p<=j-1; p++) {
                    for(int q=p+1; q<=j; q++) {
                        if(s2c[p]==s2c[q]) {
                            unique = false;
                            break Slice;
                        }
                    }
                }
                if(unique) {
                    ret.add(j - i + 1);
                }

            }
        }
        /*得到所有的差中最大的*/
        return ret.last();
    }
}
