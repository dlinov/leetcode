package io.github.dlinov.leetcode;

public class Task289GameOfLife {
    class Solution {
        public void gameOfLife(int[][] board) {
            final int m = board.length;
            if (m < 1) return;
            final int n = board[0].length;
            int[][] result = new int[m][n];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    int aliveNeighbours = 0;
                    aliveNeighbours += (i > 0 && j > 0) ? board[i - 1][j - 1] : 0;
                    aliveNeighbours += (i > 0) ? board[i - 1][j] : 0;
                    aliveNeighbours += (i > 0 && j < n - 1) ? board[i - 1][j + 1] : 0;
                    aliveNeighbours += (j > 0) ? board[i][j - 1] : 0;
                    aliveNeighbours += (j < n - 1) ? board[i][j + 1] : 0;
                    aliveNeighbours += (i < m - 1 && j > 0) ? board[i + 1][j - 1] : 0;
                    aliveNeighbours += (i < m - 1) ? board[i + 1][j] : 0;
                    aliveNeighbours += (i < m - 1 && j < n - 1) ? board[i + 1][j + 1] : 0;
                    final int cell = board[i][j];
                    if (cell == 0) {
                        result[i][j] = aliveNeighbours == 3 ? 1 : 0;
                    } else {
                        result[i][j] = (aliveNeighbours == 2 || aliveNeighbours == 3) ? 1 : 0;
                    }
                }
            }
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    board[i][j] = result[i][j];
                }
            }
        }
    }
}
