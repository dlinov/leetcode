package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1461CheckIfAStringContainsAllBinaryCodesOfSizeK {
    class Solution {
        public boolean hasAllCodes(String s, int k) {
            final Set<String> allSubstrings = new HashSet<>();
            for (int i = 0; i <= s.length() - k; ++i) {
                allSubstrings.add(s.substring(i, i + k));
            }
            return allSubstrings.size() == (1 << k);
        }
    }
}