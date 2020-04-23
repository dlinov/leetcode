package io.github.dlinov.leetcode;

public class Task201BitwiseAndofNumbersRange {
    class Solution {
        public int rangeBitwiseAnd(int m, int n) {
            if (m == 0) return 0;
            if (m == n) return m;
            int result = 0;
            int power2 = 1;
            while (power2 <= n && power2 > 0) {
                final int mAnd = m & power2;
                if (mAnd == (n & power2)) {
                    if (mAnd != 0) {
                        result += power2;
                    }
                } else {
                    result = 0;
                }
                power2 <<= 1;
            }
            return result;
        }
    }
}