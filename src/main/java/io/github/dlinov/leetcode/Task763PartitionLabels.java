package io.github.dlinov.leetcode;

import java.util.*;

public class Task763PartitionLabels {
    class Solution {
        public List<Integer> partitionLabels(String S) {
            final List<Integer> result = new ArrayList<>();
            int first = 0, n = S.length();
            while (first < n) {
                char ch = S.charAt(first);
                int last = S.lastIndexOf(ch);
                for (int i = first + 1; i < last; ++i) {
                    ch = S.charAt(i);
                    last = Math.max(S.lastIndexOf(ch), last);
                }
                result.add(last - first + 1);
                first = last + 1;
            }
            return result;
        }
    }
}