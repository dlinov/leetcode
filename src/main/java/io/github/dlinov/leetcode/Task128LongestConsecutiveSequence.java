package io.github.dlinov.leetcode;

import java.util.*;

public class Task128LongestConsecutiveSequence {
    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) return 0;
            final TreeSet<Integer> numSet = new TreeSet<>();
            int min = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] < min) min = nums[i];
                numSet.add(nums[i]);
            }
            int maxResult = 1, currResult = 1;
            Integer curr = min;
            while (numSet.higher(curr) != null) {
                if (numSet.contains(curr + 1)) {
                    ++currResult;
                    ++curr;
                } else {
                    maxResult = Math.max(maxResult, currResult);
                    currResult = 1;
                    curr = numSet.higher(curr);
                }
            }
            return Math.max(maxResult, currResult);
        }
    }
}