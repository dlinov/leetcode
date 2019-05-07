package io.github.dlinov.leetcode;

import java.util.*;

public class Task152MaximumProductSubarray {
    class Solution {
        public int maxProduct(int[] nums) {
            final int n = nums.length;
            int product = nums[0];
            int max = product;
            int min = product;
            for (int i = 1; i < n; ++i) {
                final int curr = nums[i];
                int prevMax = max;
                max = Math.max(max * curr, Math.max(min * curr, curr));
                min = Math.min(prevMax * curr, Math.min(min * curr, curr));
                if (max > product) {
                    product = max;
                }
            }
            return product;
        }
    }
}
