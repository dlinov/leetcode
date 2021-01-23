package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1392SortTheMatrixDiagonally {
    class Solution {
        public int[][] diagonalSort(int[][] mat) {
            final int m = mat.length;
            final int n = mat[0].length;
            final Map<Integer, PriorityQueue<Integer>> d = new HashMap<>();
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    d.putIfAbsent(i - j, new PriorityQueue<>());
                    d.get(i - j).add(mat[i][j]);
                }
            }
            for (int i = 0; i < m; ++i)
                for (int j = 0; j < n; ++j)
                    mat[i][j] = d.get(i - j).poll();
            return mat;
        }
    } 
}
