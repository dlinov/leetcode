package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1424DiagonalTraverseII {
    class Solution {
        public int[] findDiagonalOrder(List<List<Integer>> nums) {
            final Map<Integer, Stack<Integer>> diagonals = new TreeMap<>();
            int ri = 0;
            int k = 0;
            for (var row : nums) {
                var ci = 0;
                for (var elem : row) {
                    var key = ri + ci;
                    var q = diagonals.get(key);
                    if (q == null) {
                        q = new Stack<Integer>();
                        diagonals.put(key, q);
                    }
                    q.add(elem);
                    ++k;
                    ++ci;
                }
                ++ri;
            }
            int[] flattened = new int[k];
            k = 0;
            for (var entry : diagonals.entrySet()) {
                var diag = entry.getValue();
                while (!diag.isEmpty()) {
                    flattened[k++] = diag.pop();
                }
            }
            return flattened;
        }
    }
}