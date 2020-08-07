package io.github.dlinov.leetcode;

import java.util.*;

public class Task442FindAllDuplicatesInAnArray {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            final Set<Integer> elems = new HashSet<>();
            final List<Integer> result = new ArrayList<>();
            for (int i = 0; i < nums.length; ++i) {
                if (elems.contains(nums[i])) {
                    result.add(nums[i]);
                } else {
                    elems.add(nums[i]);
                }
            }
            return result;
        }
    }
}