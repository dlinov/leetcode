package io.github.dlinov.leetcode;

import java.util.*;

public class Task421MaxXOROfTwoNumbersInAnArray {
    class Solution {
        public int findMaximumXOR(int[] nums) {
            int max = 0, mask = 0;
            final Set<Integer> s = new HashSet<>();
            for (int i = 30; i >= 0; --i) { // 30 because positive only
                mask |= (1 << i);
                for (int j = 0; j < nums.length; ++ j) {
                    s.add(nums[j] & mask);
                }
                final int newMax = max | (1 << i);
                for (Integer m : s) {
                    if (s.contains(m ^ newMax)) {
                        max = newMax;
                        break;
                    }
                }
                s.clear();
            }
            return max;
        }
    }
}
