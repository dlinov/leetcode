package io.github.dlinov.leetcode1k;

public class Task1680ConcatenationOfConsecutiveBinaryNumbers {
    class Solution {
        public int concatenatedBinary(int n) {
            int MOD = 1_000_000_007;
            long sum = 0;
            for (int i = 1; i <= n; i++)
                sum = (sum * (int) Math.pow(2, Integer.toBinaryString(i).length()) + i) % MOD;
            return (int) sum;
        }
    }
}
