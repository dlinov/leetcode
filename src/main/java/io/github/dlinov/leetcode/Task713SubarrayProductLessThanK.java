package io.github.dlinov.leetcode;

public class Task713SubarrayProductLessThanK {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int left = 0, right = 0, result = 0, p = 1;
            while (right < nums.length) {
                p *= nums[right++];
                while (left < right && p >= k) {
                    p /= nums[left++];
                }
                result += (right - left);
            }   
            return result;
        }
    }
}
