package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1424DiagonalTraverseII {
    class Solution {
        public int[] findDiagonalOrder(List<List<Integer>> nums) {
            final int n = nums.size();
            final List<Iterator<Integer>> rows = new ArrayList<>(n);
            for (List<Integer> row : nums) {
                rows.add(row.iterator());
            }
            List<Integer> flattened = new ArrayList<>(32);
            for (int i = 0; i < n; ++i) {
                for (int j = i; j >= 0; --j) {
                    if (j < n) {
                        var row = rows.get(j);
                        if (row.hasNext()) {
                            flattened.add(row.next());
                        }
                    }
                }
            }
            boolean allEmpty = false;
            while (!allEmpty) {
                allEmpty = true;
                for (int i = n - 1; i >= 0; --i) {
                    var row = rows.get(i);
                    if (row.hasNext()) {
                        flattened.add(row.next());
                        allEmpty = false;
                    }
                }
            }
            return flattened.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}