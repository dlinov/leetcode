package io.github.dlinov.leetcode1k;

public class Task1422MaximumScoreAfterSplittingAString {
    class Solution {
        public int maxScore(String s) {
            final int n = s.length();
            int max1 = 0;
            for (int i = 0; i < n; ++i) {
                if (s.charAt(i) == '1') {
                    ++max1;
                }
            }
            int result = 0;
            int left = 0;
            int right = max1;
            for (int i = 0; i < n - 1; ++i) {
                if (s.charAt(i) == '0') {
                    result = Math.max(++left + right, result);
                } else {
                    result = Math.max(left + --right, result);
                }
            }
            return result;
        }
    }
}