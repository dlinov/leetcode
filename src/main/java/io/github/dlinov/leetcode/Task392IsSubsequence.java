package io.github.dlinov.leetcode;

public class Task392IsSubsequence {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            if (s.isEmpty()) return true;
            int j = 0;
            for (int i = 0; i < t.length(); ++i) {
                if (t.charAt(i) == s.charAt(j)) {
                    ++j;
                    if (j == s.length()) {
                        break;
                    }
                }
            }
            return j == s.length();
        }
    }
}