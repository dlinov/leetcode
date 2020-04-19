package io.github.dlinov.leetcode1k;

public class Task1413MinimumValueToGetPositiveStepByStepSum {
    class Solution {
        public int minStartValue(int[] nums) {
            int sum = 0;
            int minValue = 1;
            for (int i = 0; i < nums.length; ++i) {
                sum += nums[i];
                minValue = Math.min(sum, minValue);
            }
            return minValue > 0 ? minValue : -minValue + 1;
        }
    }
}