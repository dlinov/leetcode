package io.github.dlinov.leetcode;

import java.util.*;

public class Task056MergeIntervals {
    class Solution {
        public int[][] merge(int[][] intervals) {
            if (intervals.length == 0) return intervals;
            Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
            List<int[]> arrList = new ArrayList<>();
            int[] curr = intervals[0];
            for (int i = 1; i < intervals.length; ++i) {
                if (curr[1] >= intervals[i][0]) {
                    curr[1] = Math.max(intervals[i][1], curr[1]);
                } else {
                    arrList.add(curr);
                    curr = intervals[i];
                }
            }
            arrList.add(curr);
            return arrList.toArray(new int[arrList.size()][]);
        }
    }
}
