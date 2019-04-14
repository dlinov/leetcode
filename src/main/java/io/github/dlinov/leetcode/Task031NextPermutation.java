package io.github.dlinov.leetcode;

import java.util.*;

class Task031NextPermutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            boolean done = false;
            final int length = nums.length;
            for (int i = length - 1; i > 0; --i) {
                // find first decreasing elem
                if (nums[i] > nums [i - 1]) {
                    // find last elem larger than nums[i-1] and swap
                    for (int j = i; j < length; ++j) {
                        final int iMinusOne = nums[i - 1];
                        if (nums[j] > iMinusOne && (j + 1 == length || nums[j + 1] <= iMinusOne)) {
                            nums[i - 1] = nums[j];
                            nums[j] = iMinusOne;
                        }
                    }
                    // reverse subarray [i..length - 1]
                    for (int j = length - 1; j > i; --j, ++i) {
                        final int tmp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = tmp;
                    }
                    done = true;
                    break;
                }
            }
            if (!done) {
                // just reverse nums
                for (int i = 0, j = length - 1; j > i; ++i, --j) {
                    final int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
    }
}