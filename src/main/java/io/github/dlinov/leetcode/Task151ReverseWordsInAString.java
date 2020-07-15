package io.github.dlinov.leetcode;

public class Task151ReverseWordsInAString {
    class Solution {
        public String reverseWords(String s) {
        final String[] parts = s.split(" ");
        final StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; --i) {
            if (!parts[i].isBlank()) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(parts[i]);
            }
        }
        return sb.toString();
        }
    }
}