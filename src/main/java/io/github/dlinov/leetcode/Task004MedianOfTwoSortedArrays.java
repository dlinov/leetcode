package io.github.dlinov.leetcode;

class Task004MedianOfTwoSortedArrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            final int n1 = nums1.length;
            final int n2 = nums2.length;
            final int n3 = n1 + n2;
            final boolean isEven1 = n1 % 2 == 0;
            final boolean isEven2 = n2 % 2 == 0;
            final boolean isEven3 = n3 % 2 == 0;
            double m1 = 0;
            double m2 = 0;
            if (isEven1) {
                m1 = (double) (nums1[n1 / 2] + nums2[n1 / 2]) / 2;
            } else {
                m1 = (double) nums1[n1 / 2];
            }
            if (isEven1) {
                m1 = (double) (nums1[n1 / 2] + nums2[n1 / 2]) / 2;
            } else {
                m1 = (double) nums1[n1 / 2];
            }
            return 0d;
        }
    }
}