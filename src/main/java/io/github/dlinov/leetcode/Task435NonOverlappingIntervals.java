package io.github.dlinov.leetcode;

class Task435NonOverlappingIntervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            java.util.Arrays.sort(intervals, (int[] a, int[] b) -> a[1] - b[1]);
            int end = intervals[0][1];
            int count = 1;
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] >= end) {
                    end = intervals[i][1];
                    count++;
                }
            }
            return intervals.length - count;
        }
    }
}
