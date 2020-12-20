package io.github.dlinov.leetcode;

public class Task977SquaresOfSortedArray {
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            int i = 0, j = n - 1;
            for (int p = n - 1; p >= 0; p--) {
                result[p] = Math.abs(nums[i]) > Math.abs(nums[j])
                    ? nums[i] * nums[i++]
                    : nums[j] * nums[j--];
            }
            return result;
        }
    }
}
