package io.github.dlinov.leetcode;

import java.util.*;

class Task139WordBreak {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            final int[] memo = new int[s.length() + 1];
            Arrays.fill(memo, -1);
            return innerBreak(s, new HashSet<String>(wordDict), memo);
        }

        private boolean innerBreak(String s, Set<String> words, int[] memo) {
            final int n = s.length();
            if (n == 0) {
                return true;
            }
            if (memo[n] == -1) {
                memo[n] = 0;
                for (int i = 1; i <= n; ++i) {
                    final String prefix = s.substring(0, i);
                    if (words.contains(prefix) && innerBreak(s.substring(i), words, memo)) {
                        memo[n] = 1;
                        return true;
                    }
                }
            }
            return memo[n] == 1;
        }
    }
}