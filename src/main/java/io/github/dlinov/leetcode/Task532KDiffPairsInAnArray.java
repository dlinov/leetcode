package io.github.dlinov.leetcode;

import java.util.*;

public class Task532KDiffPairsInAnArray {
    class Solution {
        public int findPairs(int[] nums, int k) {
            final Set<Integer> numSet = new HashSet<>();
            int result = 0;
            if (k > 0) {
                for (int i = 0; i < nums.length; ++i) {
                    numSet.add(nums[i]);
                }
                for (Integer n : numSet) {
                    if (numSet.contains(n + k)) ++result;
                }
            } else {
                final Set<Integer> usedSet = new HashSet<>();
                for (int i = 0; i < nums.length; ++i) {
                    if (numSet.contains(nums[i]) && !usedSet.contains(nums[i])) {
                        ++result;
                        usedSet.add(nums[i]);
                    } else numSet.add(nums[i]);
                }
            }
            return result;
        }
    }
}
