package io.github.dlinov.leetcode1k;

public class Task1493LongestSubarrayOf1sAfterDeletingOneElement {
    class Solution {
        public int longestSubarray(int[] nums) {
        int curr = 0, prev = 0; // latest two subarrays' lengths
        int latest0 = -1;
        int max = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) curr++;
            else {
                if (latest0 == i - 1) {
                    prev = 0; // cannot sum with curr as there is more than one 0 between them
                }
                max = Math.max(curr + prev, max);
                prev = curr;
                curr = 0;
                latest0 = i;
            }
        }
        max = Math.max(curr + prev, max);
        if (max == nums.length) max--;
        return max;
        }
    }
}