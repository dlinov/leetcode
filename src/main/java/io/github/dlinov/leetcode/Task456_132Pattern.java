package io.github.dlinov.leetcode;

public class Task456_132Pattern {
    class Solution {
        public boolean find132pattern(int[] nums) {
            for (int j = 0, min = Integer.MAX_VALUE; j < nums.length; j++) {
                min = Math.min(nums[j], min);
                if (min == nums[j]) continue;
                for (int k = nums.length - 1; k > j; k--) {
                    if (min < nums[k] && nums[k] < nums[j]) return true;
                }
            }
            return false;
        }
    }
}
