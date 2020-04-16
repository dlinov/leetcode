package io.github.dlinov.leetcode1k;

public class Task1409QueriesOnAPermutationWithKey {
    public class Solution {
        public int[] processQueries(int[] queries, int m) {
            var ms = new int[m];
            var result = new int[queries.length];
            for (int i = 1; i <= m; ++i) {
                ms[i - 1] = i;
            }
            for (int i = 0; i < queries.length; ++i) {
                final var qi = queries[i];
                int j = 0;
                for (; j < ms.length; ++j) {
                    if (ms[j] == qi) {
                        break;
                    }
                }
                if (j == ms.length) {
                    j = -1;
                }
                result[i] = j;
                if (j > 0) {
                    var qj = ms[j];
                    System.arraycopy(ms, 0, ms, 1, j);
                    ms[0] = qj;
                }
            }
            return result;
        }
    }
}