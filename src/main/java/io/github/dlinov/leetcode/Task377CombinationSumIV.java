package io.github.dlinov.leetcode;

public class Task377CombinationSumIV {
    class Solution {
        public int combinationSum4(int[] nums, int target) {
            final int[] memo = new int[target + 1];
            java.util.Arrays.fill(memo, -1);
            return inner(nums, target, target, memo);
        }

        private int inner(int[] nums, int target, int rem, int[] memo) {
            if (memo[rem] != -1) {
                return memo[rem];
            }
            if (rem == 0) {
                return 1;
            }
            int counter = 0;
            for (int i = 0; i < nums.length; ++i) {
                final int nextRem = rem - nums[i];
                if (nextRem >= 0) {
                    counter += inner(nums, target, nextRem, memo);
                }
            }
            memo[rem] = counter;
            return counter;
        }
    }
}
