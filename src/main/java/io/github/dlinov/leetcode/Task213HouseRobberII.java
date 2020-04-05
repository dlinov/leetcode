package io.github.dlinov.leetcode;

public class Task213HouseRobberII {
class Solution {
    public int rob(int[] nums) {
        final int[] memo = new int[nums.length];
        final int result = inner(nums, memo);
        return result;
    }

    private int inner(final int[] nums, final int[] memo) {
        final int n = nums.length;
        switch (n) {
            case 0: return 0;
            case 1: return nums[0];
            default:
                memo[0] = nums[0];
                memo[1] = Math.max(nums[0], nums[1]);
                // don't rob last house
                for (int i = 2; i < n - 1; ++i) {
                    memo[i] = Math.max(memo[i - 2] + nums[i], memo[i - 1]);
                }
                final int firstRobbed = memo[n - 2];
                // don't rob first house
                memo[0] = 0;
                memo[1] = nums[1];
                for (int i = 2; i < n; ++i) {
                    memo[i] = Math.max(memo[i - 2] + nums[i], memo[i - 1]);
                }
                final int lastRobbed = memo[n - 1];
                return Math.max(firstRobbed, lastRobbed);
        }
    }
}
}
