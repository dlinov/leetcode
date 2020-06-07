package io.github.dlinov.leetcode;

public class Task518CoinChange2 {
    class Solution {
    public int change(int amount, int[] coins) {
        int[][] memo = new int[coins.length + 1][amount + 1];
        memo[0][0] = 1;
        for (int i = 1; i <= coins.length; ++i) {
            memo[i][0] = 1;
            for (int j = 1; j <= amount; ++j) {
                memo[i][j] = memo[i - 1][j];
                if (j - coins[i - 1] >= 0) {
                    memo[i][j] += memo[i][j - coins[i - 1]];
                }
            }
        }
        return memo[coins.length][amount];
    }
    }
}