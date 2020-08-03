package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1525NumberOfGoodWaysToSplitAString {
    class Solution {
        public int numSplits(String s) {
        int result = 0;
        final Map<Character, Integer> left = new HashMap<>();
        final Map<Character, Integer> right = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            right.put(s.charAt(i), right.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            left.put(s.charAt(i), right.getOrDefault(s.charAt(i), 0) + 1);
            final Integer rCount = right.get(s.charAt(i));
            if (rCount > 1) {
                right.put(s.charAt(i), rCount - 1);
            } else {
                right.remove(s.charAt(i));
            }
            if (left.keySet().size() == right.keySet().size()) {
                result++;
            }
        }
        return result;
        }
    }
}