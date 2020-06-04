package io.github.dlinov.leetcode;

public class Task344ReverseString {
    class Solution {
        public void reverseString(char[] s) {
        final int len = s.length;
        for (int i = 0; i < len / 2; ++i) {
            final char tmp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = tmp;
        }
        }
    }
}