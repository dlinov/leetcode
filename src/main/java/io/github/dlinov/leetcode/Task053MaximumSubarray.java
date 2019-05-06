package io.github.dlinov.leetcode;

import java.util.*;

class Task053MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            final int n = nums.length;
            int maxSum = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < n; ++i) {
                sum += nums[i];
                if (nums[i] > sum) {
                    sum = nums[i];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            return maxSum;
        }
    }
}