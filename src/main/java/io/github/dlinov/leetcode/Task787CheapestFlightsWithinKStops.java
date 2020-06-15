package io.github.dlinov.leetcode;

import java.util.*;

public class Task787CheapestFlightsWithinKStops {
    class Solution {
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
            final int max = 10000 * (K + 1) + 1;
            final int[][] dp = new int[n][K + 2];
            for (int i = 0; i < n;) {
                Arrays.fill(dp[i++], max);
            }
            dp[src][0] = 0;
            for (int i = 1; i < K + 2; ++i) {
                for (int j = 0; j < flights.length; ++j) {
                    final int[] f = flights[j];
                    dp[f[1]][i] = Math.min(dp[f[1]][i], dp[f[0]][i - 1] + f[2]);
                }
            }
            int min = max;
            for (int i = 1; i < K + 2; ++i) {
                min = Math.min(dp[dst][i], min);
            }
            return min == max ? -1 : min;
        }
    }
}