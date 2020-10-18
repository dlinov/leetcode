package io.github.dlinov.leetcode;

import java.util.*;

public class Task389FindTheDifference {
    class Solution {
        public char findTheDifference(String s, String t) {
            final Map<Character, Integer> chars = new HashMap<>();
            for (int i = 0; i < s.length(); ++i) {
                chars.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
            }
            for (int i = 0; i < t.length(); ++i) {
                final int rem = chars.compute(t.charAt(i), (k, v) -> v == null ? -1 : v - 1);
                if (rem < 0) return t.charAt(i);
            }
            throw new RuntimeException("not found!");
        }
    }
}
