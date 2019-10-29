package io.github.dlinov.leetcode;

class Task004MedianOfTwoSortedArrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length <= nums2.length) {
                return median(nums1, nums2);
            } else {
                return median(nums2, nums1);
            }
        }

        double median(int[] arr1, int[] arr2) {
            int n = arr1.length;
            int m = arr2.length;
            int low = 0;
            int high = n;
            double result = Double.NEGATIVE_INFINITY;
            while (low <= high) {
                int i = (low + high) / 2;
                int j = (n + m + 1) / 2 - i;
                int maxLeftX = i > 0 ? arr1[i - 1] : Integer.MIN_VALUE;
                int minRightX = i == n ? Integer.MAX_VALUE : arr1[i];
                int maxLeftY = j > 0 ? arr2[j - 1] : Integer.MIN_VALUE;
                int minRightY = j == m ? Integer.MAX_VALUE : arr2[j];
                if (maxLeftX <= minRightY && minRightX >= maxLeftY) {
                    if ((n + m) % 2 == 0) {
                        result = (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                    } else {
                        result = Math.max(maxLeftX, maxLeftY);
                    }
                    break;
                } else if (maxLeftX > minRightY) {
                    high = i - 1;
                } else {
                    low = i + 1;
                }   
            }
            return result;
        }
    }
}