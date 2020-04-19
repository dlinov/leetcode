package io.github.dlinov.leetcode1k;

public class Task1415TheKthLexicographicalStringOfAllHappyStringsOfLengthN {
    class Solution {
        public String getHappyString(int n, int k) {
            final int power = 1 << (n - 1);
            final int overall = 3 * power;
            if (k > overall) return "";
            final char[] chars = new char[n];
            final char[] abc = { 'a', 'b', 'c' };
            int kRem = k - 1;
            final int div = kRem / power;
            int rem = power;
            kRem = kRem - div * power;
            chars[0] = abc[div];
            for (int i = 1; i < n; ++i) {
                rem = rem / 2;
                if (kRem >= rem) {
                    kRem -= rem;
                    chars[i] = chars[i-1] == 'c' ? 'b' : 'c';
                } else {
                    chars[i] = chars[i-1] == 'a' ? 'b' : 'a';
                }
            }
            return new String(chars);
        }
    }
}