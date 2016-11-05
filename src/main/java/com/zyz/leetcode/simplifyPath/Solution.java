package com.zyz.leetcode.simplifyPath;

import java.util.ArrayList;

/**
 * Created by ZhangYuanzhuo on 2016/11/3.
 */
public class Solution {
    public String simplifyPath(String path) {
        /*
        * 以"/"分割字符串存入字符串数组
        * 如果碰到".."就删除上一级目录
        * 碰到"."和""就跳过
        * 其他的放入新字符串数组
        * 对新字符串数组加"/"得到结果
        * */
        String res = "";
        String[] item = path.split("/");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<item.length; i++) {
            if("..".equals(item[i])) {
                if(list.size()>0) {
                    list.remove(list.size()-1);
                }
            }else if(!".".equals(item[i]) && !"".equals(item[i])) {
                list.add(item[i]);
            }
        }
        if(list.size()==0) {
            return "/";
        }
        for(int i=0; i<list.size(); i++) {
            res += "/";
            res += list.get(i);
        }
        return res;
    }
}