package io.github.dlinov.leetcode;

public class Task283MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            final int size = nums.length;
            for (int i = 0, nz = 0; i < size; ++i) {
                if (nums[i] != 0) {
                    final int tmp = nums[i];
                    nums[i] = nums[nz];
                    nums[nz++] = tmp;
                }
            }
        }
    }
}