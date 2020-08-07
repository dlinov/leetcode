package io.github.dlinov.leetcode1k;

public class Task1446ConsecutiveCharacters {
    class Solution {
        public int maxPower(String s) {
            if (s.isEmpty()) return 0;
            int max = 1;
            char prev = s.charAt(0);
            int counter = 1;
            for (int i = 1; i < s.length(); ++i) {
                if (s.charAt(i) == prev) {
                    ++counter;
                } else {
                    max = Math.max(max, counter);
                    counter = 1;
                    prev = s.charAt(i);
                }
            }
            max = Math.max(max, counter);
            return max;
        }
    }
    
}