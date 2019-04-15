package io.github.dlinov.leetcode;

import java.util.*;

class Task035SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            final int length = nums.length;
            int result = 0;
            for (int left = 0, right = length - 1; right >= left; ) {
                final int i = (left + right) / 2;
                if (nums[i] == target) {
                    result = i;
                    break;
                }
                if (left != right) {
                    if (nums[i] > target) {
                        right = i;
                    } else {
                        left = i + 1;
                    }
                } else {
                    if (nums[i] > target) {
                        result = i;
                    } else {
                        result = i + 1;
                    }
                    break;
                }
            }
            return result;
        }
    }
}
