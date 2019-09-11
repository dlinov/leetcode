package io.github.dlinov.leetcode;

class Task009PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            } else {
                final int mult = 10;
                int m = 1;
                int digits = 1;
                while (x / (m * mult) > 0 && digits < 10) {
                    m *= mult;
                    ++digits;
                }
                int tmp = x;
                for (int i = 0; i < digits / 2; ++i) {
                    if (tmp / m != tmp % mult) {
                        return false;
                    }
                    tmp = (tmp % m) / mult;
                    m /= mult * mult;
                }
                return true;
            }
        }
    }
}