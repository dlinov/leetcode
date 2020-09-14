package io.github.dlinov.leetcode;

import java.util.*;

public class Task299BullsAndCows {
    class Solution {
        public String getHint(String secret, String guess) {
        final Set<Integer> indicesToCheck = new HashSet<>();
        int bullCount = 0;
        final Map<Character, TreeSet<Integer>> secretIndices = new HashMap<>();
        for (int i = 0; i < secret.length(); ++i) {
            if (secret.charAt(i) == guess.charAt(i)) bullCount++;
            else {
                indicesToCheck.add(i);
                final Set<Integer> s = secretIndices.computeIfAbsent(secret.charAt(i), ch -> new TreeSet<>());
                s.add(i);
            }
        }
        int cowCount = 0;
        for (Integer idx : indicesToCheck) {
            final char gCh = guess.charAt(idx);
            final TreeSet<Integer> chIndices = secretIndices.get(gCh);
            if (chIndices != null && !chIndices.isEmpty()) {
                cowCount++;
                chIndices.remove(chIndices.first());
            }
        }
        return String.format("%dA%dB", bullCount, cowCount);
        }
    }
}
