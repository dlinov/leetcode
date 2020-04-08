package io.github.dlinov.leetcode;

public class Task055JumpGame {
    class Solution {
        public boolean canJump(int[] nums) {
            final int size = nums.length;
            Boolean[] memo = new Boolean[size];
            java.util.Arrays.fill(memo, null);
            memo[size - 1] = Boolean.TRUE;
            for (int i = size - 1; i >= 0; --i) {
                if (memo[i] == null) {
                    boolean finalFlag = Boolean.FALSE;
                    for (int j = 0; !finalFlag && i + j < size && j <= nums[i]; ++j) {
                        finalFlag |= memo[i + j] == null ? Boolean.FALSE : memo[i + j];
                    }
                    memo[i] = finalFlag;
                }
            }
            return memo[0];
        }
    }
}