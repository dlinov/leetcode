package io.github.dlinov.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Task079WordSearch {
    class Solution {
    private final Set<Integer> visited;
    private int m, n;
    private char[][] board;
    private String word;

    public Solution() {
        visited = new HashSet<>();
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        this.board = board;
        this.word = word;
        boolean result = false;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                result = result || search(i, j, 0);
            }
        }
        return result;
    }

    private boolean search(int i, int j, int k) {
        // m cannot be bigger than 6 by task constraints, so this "hash" will work
        final int pointHash = i * 8 + j;
        if (visited.contains(pointHash)) return false;
        final char curr = word.charAt(k);
        final char point = board[i][j];
        if (word.length() == k + 1) return curr == point;
        visited.add(pointHash);
        boolean isFound = false;
        if (curr == point) {
            if (i - 1 >= 0) {
                isFound = isFound || search(i - 1, j, k + 1);
            }
            if (i + 1 < m) {
                isFound = isFound || search(i + 1, j, k + 1);
            }
            if (j - 1 >= 0) {
                isFound = isFound || search(i, j - 1, k + 1);
            }
            if (j + 1 < n) {
                isFound = isFound || search(i, j + 1, k + 1);
            }
        }
        visited.remove(pointHash);
        return isFound;
    }
    }
}
