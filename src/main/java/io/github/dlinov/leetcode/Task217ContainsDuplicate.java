package io.github.dlinov.leetcode;

import java.util.*;

class Task217ContainsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            final Set<Integer> distinct = new HashSet<>();
            for (int i = 0; i < nums.length; ++i) {
                distinct.add(nums[i]);
                if (i + 1 != distinct.size()) {
                    return true;
                }
            }
            return false;
        }
    }
}
