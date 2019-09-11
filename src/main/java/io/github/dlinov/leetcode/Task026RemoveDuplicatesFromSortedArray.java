package io.github.dlinov.leetcode;

class Task026RemoveDuplicatesFromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            final int length = nums.length;
            if (length == 0) return 0;
            int i = 0;
            for (int k = 1; k < length; k++) {
                if (nums[k] != nums[i]) {
                    i++;
                    nums[i] = nums[k];
                }
            }
            return i + 1;
        }
    }
}