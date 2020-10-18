package io.github.dlinov.leetcode;

public class Task495TeemoAttacking {
    class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            if (timeSeries.length == 0) return 0;
            int sum = 0, c1 = 0;
            for (int i = 0; i < timeSeries.length; ++i) {
                c1 = Math.max(c1, timeSeries[i]);
                int c2 = timeSeries[i] + duration;
                sum += c2 - c1;
                c1 = c2;
            }
            return sum;
        }
    }
}
