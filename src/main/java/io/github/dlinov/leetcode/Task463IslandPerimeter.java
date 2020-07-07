package io.github.dlinov.leetcode;

public class Task463IslandPerimeter {
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int result = 0;
            for (int i = 0; i < grid.length; ++i) {
                final boolean topMost = i == 0;
                final boolean bottomMost = i == grid.length - 1;
                for (int j = 0; j < grid[0].length; ++j) {
                    if (grid[i][j] == 1) {
                        result += 4;
                        if (!topMost) result -= grid[i - 1][j];
                        if (!bottomMost) result -= grid[i + 1][j];
                        if (j > 0) result -= grid[i][j - 1];
                        if (j < grid[0].length - 1) result -= grid[i][j + 1];
                    }
                }
            }
            return result;
        }
    }
}