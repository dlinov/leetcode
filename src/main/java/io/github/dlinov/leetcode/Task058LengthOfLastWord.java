package io.github.dlinov.leetcode;

public class Task058LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            final String trimmed = s.trim();
            int lastSpace = trimmed.lastIndexOf(' ');
            return trimmed.length() - 1 - lastSpace; 
        }
    }
}