package io.github.dlinov.leetcode;

public class Task191NumberOf1Bits {
    class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int result = 0;
            final boolean isNeg = n < 0;
            int x = n;
            if (isNeg) {
                x = ~x;
            }
            while (x > 0) {
                if (x % 2 != 0) {
                    ++result;
                }
                x /= 2;
            }
            if (isNeg) {
                result = 32 - result;
            }
            return result;
        }
    }
}
