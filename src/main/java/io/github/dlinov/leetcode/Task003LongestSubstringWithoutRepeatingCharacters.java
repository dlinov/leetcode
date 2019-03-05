package io.github.dlinov.leetcode;

import java.util.*;

public class Task003LongestSubstringWithoutRepeatingCharacters {
    
class Solution {
    public int lengthOfLongestSubstring(String s) {
        final int n = s.length();
        int max = 0;
        Map<Character, Integer> charsMap = new HashMap<>();
        for (int i = 0, j = 0; j < n; ++j) {
            final char cj = s.charAt(j);
            if (charsMap.containsKey(cj)) {
                i = Math.max(i, charsMap.get(cj));
            }
            max = Math.max(max, j - i + 1);
            charsMap.put(cj, j + 1);
        }
        return max;
    }
}
}