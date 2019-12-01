package io.github.dlinov.leetcode;

public class Task198HouseRobber {
    class Solution {
        public int rob(int[] nums) {
            final int[] memo = new int[(nums.length + 1) * 2];
            java.util.Arrays.fill(memo, -1);
            return inner(nums, 0, memo, false);
        }

        private int inner(
            final int[] nums,
            final int i,
            final int[] memo,
            final boolean prevTaken) {
            if (i >= nums.length) {
                return 0;
            }
            final int ii = i * 2;
            if (memo[ii] == -1) { // not taken
                memo[ii] = inner(nums, i + 1, memo, false);
            }
            if (memo[ii + 1] == -1) { // taken
                memo[ii + 1] = nums[i] + inner(nums, i + 1, memo, true);
            }
            if (prevTaken) {
                return memo[ii];
            } else {
                return Math.max(memo[ii], memo[ii + 1]);
            }
        }
    }
}
