package io.github.dlinov.leetcode;

public class Task189RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
            k = k % nums.length;
            if (k == 0) return;
            reverse(nums);
            reverse(nums, 0, k);
            reverse(nums, k, nums.length);
        }
        
        private void reverse(int[] arr) {
            reverse(arr, 0, arr.length);
        }
    
        private void reverse(int[] arr, int startIncl, int endExcl) {
            for (int i = 0; i < (endExcl - startIncl) / 2; ++i)
            {
                final int tmp = arr[startIncl + i];
                arr[startIncl + i] = arr[endExcl - i - 1];
                arr[endExcl - i - 1] = tmp;
            }
        }
    }
}
