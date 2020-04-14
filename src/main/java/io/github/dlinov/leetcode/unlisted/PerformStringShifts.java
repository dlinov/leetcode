package io.github.dlinov.leetcode.unlisted;

public class PerformStringShifts {
    class Solution {
        public String stringShift(String s, int[][] shift) {
            int totalShift = 0;
            for (int i = 0; i < shift.length; ++i) {
                final int[] directionAndCount = shift[i];
                totalShift += directionAndCount[1] * (directionAndCount[0] > 0 ? 1 : -1);
            }
            totalShift = s.length() - Math.floorMod(totalShift, s.length());
            return totalShift == 0 ? s : s.substring(totalShift) + s.substring(0, totalShift);
        }
    }
}