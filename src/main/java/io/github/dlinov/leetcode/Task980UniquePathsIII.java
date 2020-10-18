package io.github.dlinov.leetcode;

public class Task980UniquePathsIII {
    class Solution {
        int ways = 0;
        int sizeNoWalls = 0;
        public int uniquePathsIII(int[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            sizeNoWalls = rows * cols;
            int[] start = new int[2];
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (grid[r][c] == -1) {
                        sizeNoWalls--;
                    }
                    if (grid[r][c] == 1) {
                        start[0] = r;
                        start[1] = c;
                    }
                }
            }
            dfs(grid, start[0], start[1], 1);
            return ways;
        }
        
        private void dfs(int[][] grid, int r, int c, int counter) {
            if (grid[r][c] == -3 || grid[r][c] == -1) {
                return;
            }
            int val = grid[r][c];
            if (val == 2) {
                if (counter == sizeNoWalls) {
                    ways += 1;
                }
                return;
            }
            grid[r][c] = -3;
            if (r > 0) {
                dfs(grid, r - 1, c, counter + 1);
            }
            if (c > 0) {
                dfs(grid, r, c - 1, counter + 1);
            }
            if (r < grid.length - 1) {
                dfs(grid, r + 1, c, counter + 1);
            }
            if (c < grid[0].length - 1) {
                dfs(grid, r, c + 1, counter + 1);
            }
            grid[r][c] = val;
        }
    }
}
