package io.github.dlinov.leetcode1k;

import java.util.Arrays;

public class Task1029TwoCityScheduling {
    class Solution {
        public int twoCitySchedCost(int[][] costs) {
            int result = 0;
            int[] costsB = new int[costs.length];
            for (int i = 0; i < costs.length; ++i) {
                result += costs[i][0];
                costsB[i] = costs[i][1] - costs[i][0];
            }
            Arrays.sort(costsB);
            for (int i = 0; i < costsB.length / 2; ++i) {
                result += costsB[i];
            }
            return result;
        }
    }
}