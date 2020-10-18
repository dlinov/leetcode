package io.github.dlinov.leetcode;

public class Task704BinarySearch {
    class Solution {
        public int search(int[] nums, int target) {
            return bs(nums, target, 0, nums.length - 1);
        }
        
        private int bs(int[] nums, int target, int left, int right) {
            if (left == right) return nums[left] == target ? left : -1;
            final int mid = left + (right - left) / 2;
            if (nums[mid] >= target) return bs(nums, target, left, mid);
            else return bs(nums, target, mid + 1, right);
        }
    }
}
