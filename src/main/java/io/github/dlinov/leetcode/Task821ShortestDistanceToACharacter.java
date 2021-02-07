package io.github.dlinov.leetcode;

import java.util.*;

public class Task821ShortestDistanceToACharacter {
    class Solution {
        public int[] shortestToChar(String s, char c) {
            final List<Integer> occurs = new ArrayList<>();
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == c) occurs.add(i);
            }
            int j = 0;
            final int jMax = occurs.size() - 1;
            int curr = occurs.get(j);
            final int[] result = new int[s.length()];
            for (int i = 0; i < s.length(); ++i) {
                if (i == curr) {
                    result[i] = 0;
                    j = Math.min(j + 1, jMax);
                    curr = occurs.get(j);
                } else {
                    int prev = occurs.get(Math.max(j - 1, 0));
                    result[i] = Math.min(Math.abs(i - prev), Math.abs(i - curr));
                }
                
            }
            return result;
        }
    }
}
