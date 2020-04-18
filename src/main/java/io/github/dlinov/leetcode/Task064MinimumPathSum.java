package io.github.dlinov.leetcode;

public class Task064MinimumPathSum {
    class Solution {
        public int minPathSum(final int[][] grid) {
            final int m = grid.length;
            if (m < 1) return -1;
            final int n = grid[0].length;
            final int[][] memo = new int[m][n];
            for (int i = 0; i < m; ++i) {
                java.util.Arrays.fill(memo[i], -1);
            }
            memo[0][0] = grid[0][0]; // no need to check it explicitly in inner
            return inner(grid, memo, m - 1, n - 1);
        }

        private int inner(final int[][] grid, final int[][] memo, final int i, final int j) {
            if (memo[i][j] < 0) {
                final int topSum = i > 0 ? inner(grid, memo, i - 1, j) : Integer.MAX_VALUE;
                final int leftSum = j > 0 ? inner(grid, memo, i, j - 1) : Integer.MAX_VALUE;
                final int minSum = Math.min(topSum, leftSum);
                memo[i][j] = minSum + grid[i][j];
            }
            return memo[i][j];
        }
    }
}