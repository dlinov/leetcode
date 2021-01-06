package io.github.dlinov.leetcode1k;

public class Task1539KthMissingPositiveNumber {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            for (int i = 0; i < arr.length; ++i) {
                int prev = i == 0 ? 0 : arr[i - 1];
                k -= arr[i] - prev - 1;
                if (k <= 0) return arr[i] + k - 1;
            }
            return arr[arr.length - 1] + k;
        }
    }
}
