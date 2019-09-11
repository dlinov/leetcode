package io.github.dlinov.leetcode;

class Task027RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            final int length = nums.length;
            if (length == 0) return 0;
            int i = 0;
            for (int j = 1; j < length; ++j) {
                if (nums[i] == val && nums[j] != val) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    ++i;
                } else if (nums[i] != val) {
                    ++i;
                }
            }
            if (nums[i] != val) {
                i++;
            }
            return i;
        }
    }
}
