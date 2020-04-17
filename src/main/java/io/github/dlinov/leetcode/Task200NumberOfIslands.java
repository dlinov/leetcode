package io.github.dlinov.leetcode;

public class Task200NumberOfIslands {
    class Solution {
        public int numIslands(char[][] grid) {
            int result = 0;
            final int width = grid.length;
            if (width < 1) return 0;
            final int height = grid[0].length;
            for (int i = 0; i < width; ++i) {
                for (int j = 0; j < height; ++j) {
                    if (grid[i][j] == '1') {
                        markIsland(grid, i, j);
                        result++;
                    }
                }
            }
            return result;
        }

        private void markIsland(char[][] grid, final int i, final int j) {
            final char ch = grid[i][j];
            if (ch == '1') {
                grid[i][j] = '2';
                final int top = i - 1;
                final int bottom = i + 1;
                final int left = j - 1;
                final int right = j + 1;
                if (top >= 0) markIsland(grid, top, j);
                if (bottom < grid.length) markIsland(grid, bottom, j);
                if (left >= 0) markIsland(grid, i, left);
                if (right < grid[0].length) markIsland(grid, i, right);
            }
        }
    }
}