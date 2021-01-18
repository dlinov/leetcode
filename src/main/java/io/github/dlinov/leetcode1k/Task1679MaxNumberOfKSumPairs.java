package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1679MaxNumberOfKSumPairs {
    class Solution {
        public int maxOperations(int[] nums, int k) {
            int result = 0;
            final Map<Integer, Integer> numsMap = new HashMap<>();
            for (int n : nums) {
                numsMap.compute(n, (key, val) -> val != null ? val + 1 : 1);
            }
            for (Integer n1 : numsMap.keySet()) {
                final int val = numsMap.get(n1);
                final int n2 = k - n1;
                if (n1 == n2) {
                    result += val / 2;
                    numsMap.put(n1, val % 2);
                } else {
                    Integer val2 = numsMap.get(n2);
                    if (val2 != null) {
                        final int minSums = Math.min(val, val2);
                        result += minSums;
                        numsMap.put(n1, val - minSums);
                        numsMap.put(n2, val2 - minSums);
                    }
                }
            }
            return result;
        }
    }
}
