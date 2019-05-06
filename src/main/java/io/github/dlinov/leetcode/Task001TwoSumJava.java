package io.github.dlinov.leetcode;

import java.util.*;

public class Task001TwoSumJava {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            final int n = nums.length;
            final Map<Integer, Integer> numsMap = new HashMap<>(n);
            for (int i = 0; i < n; ++i) {
                final int complement = target - nums[i];
                if (numsMap.containsKey(complement)) {
                    return new int[] { numsMap.get(complement), i };
                }
                numsMap.put(nums[i], i);
            }
            throw new IllegalArgumentException("No pair sums up to a target");
        }
    }
}
