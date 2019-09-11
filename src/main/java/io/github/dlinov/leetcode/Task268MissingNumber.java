package io.github.dlinov.leetcode;

public class Task268MissingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            int expectedSum = nums.length * (nums.length + 1) / 2;
            int sum = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                sum += nums[i];
            }
            return expectedSum - sum;
        }
    }
}
