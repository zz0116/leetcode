package com.zyz.leetcode.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangYuanzhuo on 2017/6/8.
 * No. 56
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 1) {
            return intervals;
        }
        ArrayList<Interval> ret = new ArrayList<>();

        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));

        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for (Interval interval : intervals) {
            if (interval.start <= end) {
                end = Math.max(end, interval.end);
            } else {
                ret.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        ret.add(new Interval(start, end));

        return ret;
    }
}