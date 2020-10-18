package io.github.dlinov.leetcode;

import java.util.TreeSet;

public class Task220ContainDuplicateIII {
    class Solution {
        public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
            if (nums == null || nums.length == 0 || k <= 0) return false;
            final TreeSet<Integer> values = new TreeSet<>();
            for (int i = 0; i < nums.length; i++) {
                final long flr = Math.min((long) nums[i] + t, Integer.MAX_VALUE);
                final long cln = Math.max((long) nums[i] - t, Integer.MIN_VALUE);
                final Integer floor = values.floor((int) flr);
                final Integer ceil = values.ceiling((int) cln);
                if ((floor != null && floor >= nums[i])
                        || (ceil != null && ceil <= nums[i])) {
                    return true;
                }
                values.add(nums[i]);
                if (i >= k) {
                    values.remove(nums[i - k]);
                }
            }
            return false;
        }
    }
}
