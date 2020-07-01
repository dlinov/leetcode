package io.github.dlinov.leetcode1k;

public class Task1492TheKthFactorOfN {
    class Solution {
        public int kthFactor(int n, int k) {
            int j = 0, last = 1;
            for (int i = 1; i <= n; ++i) {
                if (n % i == 0) {
                    ++j;
                    last = i;
                    if (j == k) break;
                }
            }
            return j == k ? last : -1;
        }
    }
}