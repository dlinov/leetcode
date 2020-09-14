package io.github.dlinov.leetcode1k;

public class Task1576ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharacters {
    class Solution {
        public String modifyString(String s) {
        final StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); ++i) {
            final char ch = sb.charAt(i);
            if (ch == '?') {
                char prev = i == 0 ? '-' : sb.charAt(i - 1);
                char next = i == s.length() - 1 ? '-' : sb.charAt(i + 1);
                if (prev == 'a' && next == 'c' || prev == 'c' && next == 'a') {
                    sb.setCharAt(i, 'b');
                } else if (next != 'a' && prev != 'a') {
                    sb.setCharAt(i, 'a');
                } else {
                    sb.setCharAt(i, 'c');
                }
                // if (next != 'c' && prev != 'c') {
                //     sb.setCharAt(i, 'c');
                // } else if (next != 'a' && prev != 'a') {
                //     sb.setCharAt(i, 'b');
                // } else {
                //     sb.setCharAt(i, 'b');
                // }
            }
        }
        return sb.toString();
        }
    }
}