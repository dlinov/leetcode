package io.github.dlinov.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Task525ContiguousArray {
    class Solution {
        public int findMaxLength(int[] nums) {
            final Map<Integer, Integer> map = new HashMap<>();
            int balance = 0;
            int maxLength = 0;
            map.put(0, -1);
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == 1) {
                    balance++;
                } else {
                    balance--;
                }
                final Integer earliestIndex = map.putIfAbsent(balance, i);
                if (earliestIndex != null) {
                    maxLength = Math.max(maxLength, i - earliestIndex);
                }
            }
            return maxLength;
        }
    }
}