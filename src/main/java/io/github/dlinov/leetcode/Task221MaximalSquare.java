package io.github.dlinov.leetcode;

public class Task221MaximalSquare {
    class Solution {
        public int maximalSquare(char[][] matrix) {
            final int h = matrix.length;
            if (h == 0) return 0;
            final int w = matrix[0].length;
            if (w == 0) return 0;
            int max = 0;
            final int[][] memo = new int[h + 1][w + 1];
            for (int i = 1; i <= h; ++i) {
                for (int j = 1; j <= w; ++j) {
                    if (matrix[i - 1][j - 1] == '1') {
                        memo[i][j] = Math.min(
                            memo[i][j - 1],
                            Math.min(memo[i - 1][j - 1], memo[i - 1][j])
                        ) + 1;
                        if (memo[i][j] > max) max = memo[i][j];
                    }
                }
            }
            return max * max;
        }
    }
}