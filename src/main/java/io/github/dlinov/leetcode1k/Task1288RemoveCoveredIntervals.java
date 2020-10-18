package io.github.dlinov.leetcode1k;

public class Task1288RemoveCoveredIntervals {
    class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            int covered = 0;
            for (int i = 0; i < intervals.length; ++i) {
                for (int j = 0; j < intervals.length; ++j) {
                    if (i != j) {
                        if (intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][1]) {
                            ++covered;
                            break;
                        }
                    }
                }
            }
            return intervals.length - covered;
        }
    }
}
