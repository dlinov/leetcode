package io.github.dlinov.leetcode.unlisted;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    class Solution {
        public int countElements(int[] arr) {
            final Set<Integer> intSet = new HashSet<Integer>(arr.length);
            for (int n : arr) {
                intSet.add(n);
            }
            int result = 0;
            for (int n : arr) {
                if (intSet.contains(n + 1)) {
                    result += 1;
                }
            }
            return result;
        }
    }
}