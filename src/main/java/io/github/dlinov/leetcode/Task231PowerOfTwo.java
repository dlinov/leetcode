package io.github.dlinov.leetcode;

public class Task231PowerOfTwo {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            int p = 1;
            while (p > 0 && p < n) {
                p <<= 1;
            }
            return p == n;
        }
    }
}