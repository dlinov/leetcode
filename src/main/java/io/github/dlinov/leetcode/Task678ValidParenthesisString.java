package io.github.dlinov.leetcode;

public class Task678ValidParenthesisString {
    class Solution {
        public boolean checkValidString(final String s) {
            final int size = s.length();
            int min = 0;
            int max = 0;
            for (int i = 0; i < size; ++i) {
                final char curr = s.charAt(i);
                if (curr == '(') ++min; else --min;
                if (curr == ')') --max; else ++max;
                if (max < 0) {
                    return false;
                }
                min = Math.max(min, 0);
            }
            return min == 0;
        }
    }
}