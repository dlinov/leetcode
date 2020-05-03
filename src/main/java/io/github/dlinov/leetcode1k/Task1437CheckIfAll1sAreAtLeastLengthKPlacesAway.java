package io.github.dlinov.leetcode1k;

public class Task1437CheckIfAll1sAreAtLeastLengthKPlacesAway {
    class Solution {
        public boolean kLengthApart(int[] nums, int k) {
            int prev = -100000;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == 1) {
                    if (i - prev > k) {
                        prev = i;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}