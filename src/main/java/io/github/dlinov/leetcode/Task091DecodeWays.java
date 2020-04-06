package io.github.dlinov.leetcode;

import java.util.Arrays;

public class Task091DecodeWays {
    class Solution {
        public int numDecodings(String s) {
            final int n = s.length();
            if (n == 0) {
                return 0;
            }
            final int[] memo = new int[s.length() + 1];
            Arrays.fill(memo, 0);
            memo[0] = 1;
            memo[1] = s.charAt(0) == '0' ? 0 : 1;
            for (int i = 2; i <= n; ++i) {
                final char ch1 = s.charAt(i - 1);
                if (ch1 != '0') {
                    memo[i] += memo[i - 1];
                }
                final char ch0 = s.charAt(i - 2);
                final int num = (ch0 - '0') * 10 + (ch1 - '0');
                if (num >= 10 && num <= 26) {
                    memo[i] += memo[i - 2];
                }
            }
            return memo[n];
        }
    }
}