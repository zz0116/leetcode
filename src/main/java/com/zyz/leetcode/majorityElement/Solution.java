package com.zyz.leetcode.majorityElement;

/**
 * Created by ZhangYuanzhuo on 2017/6/11.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        /*
        * 官方最佳
        * */
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                count++;
                major = nums[i];
            } else if (major == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return major;

//        自己解答
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int n = nums.length;
//        int ret = 0;
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                if (map.get(num)+1 > n/2) {
//                    ret = num;
//                    break;
//                }
//                map.replace(num, map.get(num)+1);
//            }else {
//                if (1 > n/2) {
//                    ret = num;
//                    break;
//                }
//                map.put(num, 1);
//            }
//        }
//        return ret;
    }
}