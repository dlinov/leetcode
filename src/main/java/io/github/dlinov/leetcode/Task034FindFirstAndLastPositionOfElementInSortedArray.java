package io.github.dlinov.leetcode;

class Task034FindFirstAndLastPositionOfElementInSortedArray {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            final int length = nums.length;
            // find pivot
            int seed = -1;
            for (int left = 0, right = length - 1; right >= left; ) {
                final int i = (right + left) / 2;
                if (nums[i] == target) {
                    seed = i;
                    break;
                } else if (right == left) {
                    break;
                } else {
                    if (nums[i] > target) {
                        right = i;
                    } else {
                        left = i + 1;
                    }
                }
            }
            if (seed >= 0) {
                final int[] result = new int[2];
                // extend to left
                int leftSeed = seed;
                for (int left = 0, right = leftSeed; right > left; ) {
                    final int i = (right + left) / 2;
                    if (nums[i] == target) {
                        leftSeed = i;
                        right = i;
                    } else {
                        left = i + 1;
                    }
                }
                result[0] = leftSeed;
                // extend to right
                int rightSeed = seed;
                for (int left = rightSeed, right = length - 1; right >= left; ) {
                    final int i = (right + left) / 2;
                    if (nums[i] == target) {
                        rightSeed = i;
                        left = i + 1;
                    } else {
                        right = i - 1;
                    }
                }
                result[1] = rightSeed;
                return result;
            } else {
                return new int[] { -1, -1 };
            }
        }
    }
}
