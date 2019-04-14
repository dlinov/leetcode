package io.github.dlinov.leetcode;

import java.util.*;

class Task033SearchInRotatedSortedArray {
    class Solution {
        public int search(int[] nums, int target) {
            final int length = nums.length;
            // find pivot
            int pivot = 0; // for sorted array
            for (int left = 0, right = length - 1; right > left; ) {
                final int i = (right + left) / 2;
                if (nums[i] > nums[i + 1]) {
                    pivot = i + 1;
                    break;
                } else {
                    if (nums[i] >= nums[left]) {
                        left = i + 1;
                    } else {
                        right = i;
                    }
                }
            }
            // apply pivot shift to indexes and search as in a sorted array
            int result = -1;
            for (int left = pivot, right = pivot + length - 1; right >= left; ) {
                int iShifted = (right + left) / 2;
                int i = iShifted % length;
                if (nums[i] > target) {
                    right = iShifted - 1;
                } else if (nums[i] < target) {
                    left = iShifted + 1;
                } else {
                    result = i;
                    break;
                }
            }
            return result;
        }
    }
}