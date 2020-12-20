package io.github.dlinov.leetcode1k;

public class Task1283FindTheSmallestDivisorGivenAThreshold {
    class Solution {
        public int smallestDivisor(int[] nums, int threshold) {
            int left = 1;
            int right = nums[nums.length - 1];
            while (left <= right) {
                int pivot = left + ((right - left) >> 1);
                int num = computeSum(nums, pivot);
                if (num > threshold) left = pivot + 1;
                else right = pivot - 1;
            }
            return left;
        }
    
        private int computeSum(int[] nums, int div) {
            int sum = 0;
            for (int n : nums) sum += n / div + (n % div == 0 ? 0 : 1); 
            return sum;
        }
    }
}
