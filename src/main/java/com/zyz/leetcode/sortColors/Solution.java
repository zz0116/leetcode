package com.zyz.leetcode.sortColors;

/**
 * Created by ZhangYuanzhuo on 2016/11/8.
 */
public class Solution {
    public void sortColors(int[] nums) {
        int zeroZone = -1;
        int twoZone = nums.length;
        int p;
        for(p = 0; p<twoZone; p++) {
            if(nums[p]==0) {
                zeroZone++;
                nums[zeroZone] = 0;
            }else if(nums[p]==2) {
                twoZone--;
                while(p!=twoZone && nums[twoZone]==2) {
                    twoZone--;
                }
                if(nums[twoZone]==0) {
                    zeroZone++;
                    nums[zeroZone] = 0;
                }
                nums[twoZone] = 2;
            }
        }
        for(int i=zeroZone+1; i<twoZone; i++) {
            nums[i] = 1;
        }
    }
}