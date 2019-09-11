package io.github.dlinov.leetcode;

class Task029DivideTwoIntegers {
    class Solution {
        public int divide(int dividend, int divisor) {
            // will never be 0 by task description
            // if (divisor == 0) {
            //     throw;
            // }
            if (dividend == divisor) {
                return 1;
            }
            if (dividend == 0) {
                return 0;
            }
            if (divisor == 1) {
                return dividend;
            }
            if (divisor == -1) {
                final int result = -dividend;
                if (dividend == result) {
                    return dividend - 1;
                }
                return result;
            }
            if (divisor == -2147483648) {
                return 0;
            }
            int result = 0;
            final boolean f1 = dividend > 0;
            final boolean f2 = divisor > 0;
            int rem = dividend;
            if (f1) {
                if (f2) {
                    while (rem >= divisor) {
                        rem -= divisor;
                        ++result;
                    }
                } else {
                    while (rem >= -divisor) {
                        rem += divisor;
                        --result;
                    }
                }
            } else {
                if (f2) {
                    while (rem <= -divisor) {
                        rem += divisor;
                        --result;
                    }
                } else {
                    while (rem <= divisor) {
                        rem -= divisor;
                        ++result;
                    }
                }
            }
            return result;
        }
    }
}