package io.github.dlinov.leetcode;

import java.util.*;

class Task036ValidSudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            final int a = 9;
            final Set<Character> charsSet = new HashSet<Character>();
            // validate rows
            for (int i = 0; i < a; ++i) {
                final char[] row = board[i];
                charsSet.clear();
                int expected = 0;
                for (int j = 0; j < a; ++j) {
                    if (row[j] != '.') {
                        charsSet.add(row[j]);
                        ++expected;
                    }
                }
                if (charsSet.size() != expected) {
                    return false;
                }
            }
            // validate columns
            for (int i = 0; i < a; ++i) {
                charsSet.clear();
                int expected = 0;
                for (int j = 0; j < a; ++j) {
                    if (board[j][i] != '.') {
                        charsSet.add(board[j][i]);
                        ++expected;
                    }
                }
                if (charsSet.size() != expected) {
                    return false;
                }
            }
            // validate subboxes
            for (int k = 0; k < a; ++k) {
                final int baseRow = k / 3;
                final int baseColumn = k % 3;
                charsSet.clear();
                int expected = 0;
                for (int i = 0; i < a / 3; ++i) {
                    for (int j = 0; j < a / 3; ++j) {
                        if (board[baseRow + i][baseColumn + j] != '.') {
                            charsSet.add(board[baseRow + i][baseColumn + j]);
                            ++expected;
                        }
                    }
                }
                if (charsSet.size() != expected) {
                    return false;
                }
            }
            return true;
        }
    }
}
