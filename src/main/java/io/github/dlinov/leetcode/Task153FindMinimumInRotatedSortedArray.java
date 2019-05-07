package io.github.dlinov.leetcode;

import java.util.*;

public class Task153FindMinimumInRotatedSortedArray {
    class Solution {
        public int findMin(int[] nums) {
            final int n = nums.length;
            int left = 0 - 1;
            int right = (n - 1) + 1;
            int lastElem = nums[n - 1];
            while (right - 1 > left) {
                int mid = left + (right - left) / 2;
                if (nums[mid] <= lastElem) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            return nums[right];
        }
    }
}
