package io.github.dlinov.leetcode1k;

class Task1143LongestCommonSubsequence {
    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            int[][] memo = new int[text1.length() + 1][text2.length() + 1];
            java.util.Arrays.fill(memo[0], 0);
            for (int i = 1; i < text1.length(); ++i) {
                memo[i][0] = 0;
            }
            for (int i = 0; i < text1.length(); ++i) {
                final char char1 = text1.charAt(i);
                for (int j = 0; j < text2.length(); ++j) {
                    if (char1 == text2.charAt(j)) {
                        memo[i + 1][j + 1] = memo[i][j] + 1;
                    } else {
                        memo[i + 1][j + 1] = Math.max(memo[i][j + 1], memo[i + 1][j]);
                    }
                }
            }
            return memo[text1.length()][text2.length()];
        }
    }
}