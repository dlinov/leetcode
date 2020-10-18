package io.github.dlinov.leetcode;

import java.util.*;

public class Task859BuddyStrings {
    class Solution {
        public boolean buddyStrings(String A, String B) {
            if (A.length() != B.length()) return false;
            final Set<Character> aSwap = new HashSet<Character>();
            final Set<Character> bSwap = new HashSet<Character>();
            final Set<Character> aChars = new HashSet<Character>();
            boolean hasDuplicates = false;
            int swapsNeeded = 0;
            for (int i = 0; i < A.length(); ++i) {
                if (swapsNeeded > 2) break;
                hasDuplicates |= aChars.contains(A.charAt(i));
                aChars.add(A.charAt(i));
                if (A.charAt(i) != B.charAt(i)) {
                    ++swapsNeeded;
                    aSwap.add(A.charAt(i));
                    bSwap.add(B.charAt(i));
                }
            }
            return (hasDuplicates && swapsNeeded == 0) ||
                (swapsNeeded == 2 && aSwap.equals(bSwap));
        }
    }
}
