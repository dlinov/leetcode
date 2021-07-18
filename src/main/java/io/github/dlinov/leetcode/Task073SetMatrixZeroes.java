package io.github.dlinov.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Task073SetMatrixZeroes {
    class Solution {
        public void setZeroes(int[][] matrix) {
            final Set<Integer> rowSet = new HashSet<>();
            final Set<Integer> colSet = new HashSet<>();
            for (int i = 0; i < matrix.length; ++i) {
                for (int j = 0; j < matrix[i].length; ++j) {
                    if (matrix[i][j] == 0) {
                        rowSet.add(i);
                        colSet.add(j);
                    }
                }
            }
            for (int i = 0; i < matrix.length; ++i) {
                final boolean isRow0 = rowSet.contains(i);
                for (int j = 0; j < matrix[i].length; ++j) {
                    if (isRow0 || colSet.contains(j)) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
}
