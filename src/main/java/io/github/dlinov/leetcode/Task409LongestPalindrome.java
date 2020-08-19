package io.github.dlinov.leetcode;

import java.util.*;

public class Task409LongestPalindrome {
    class Solution {
        public int longestPalindrome(String s) {
            if (s.isEmpty()) return 0;
            final Map<Character, Integer> chars = new HashMap<>();
            for (int i = 0; i < s.length(); ++i) {
                chars.compute(s.charAt(i), (ch, n) -> n == null ? 1 : n + 1);
            }
            boolean hasOdd = false;
            int result = 0;
            for (Character ch : chars.keySet()) {
                final int count = chars.get(ch);
                if (count % 2 == 1) hasOdd = true;
                result += count / 2 * 2;
            }
            return hasOdd ? result + 1 : result;
        }
    }
}