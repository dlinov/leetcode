package io.github.dlinov.leetcode1k;

public class Task1009ComplementOfBase10Integer {
    class Solution {
        public int bitwiseComplement(int N) {
            if (N == 0) return 1;
            int res = 0;
            int p = 1;
            while (N > 0) {
                if (N % 2 == 0) {
                    res += p;
                }
                N >>= 1;
                p <<= 1;
            }
            return res;
        }
    }
}