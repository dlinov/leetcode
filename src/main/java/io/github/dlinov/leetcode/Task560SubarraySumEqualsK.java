package io.github.dlinov.leetcode;

public class Task560SubarraySumEqualsK {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int n = nums.length;
            int result = 0;
            int[] sums = new int[nums.length + 1];
            sums[0] = 0;
            for (int i = 1; i <= n; ++i) {
                sums[i] = sums[i - 1] + nums[i - 1];
            }
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j <= n; ++j) {
                    if (sums[j] - sums[i] == k) ++result;
                }
            }
            return result;
        }
    }
}