package io.github.dlinov.leetcode;

import java.util.*;

class Task016ThreeSumClosest {
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            final int n = nums.length;
            int closest = Integer.MAX_VALUE;
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < n; ++i) {
                final int n1 = nums[i];
                int j = 0;
                int k = n - 1;
                while (j < k && j < i && k > i) {
                    final int n2 = nums[j];
                    final int n3 = nums[k];
                    final int sum = n1 + n2 + n3;
                    if (sum > target) {
                        --k;
                    } else if (sum < target) {
                        ++j;
                    } else {
                        return sum;
                    }
                    final int diff = Math.abs(sum - target);
                    if (diff < minDiff) {
                        minDiff = diff;
                        closest = sum;
                    }
                }
            }
            return closest;
        }
    }
}