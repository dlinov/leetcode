package io.github.dlinov.leetcode;

public class Task880DecodedStringAtIndex {
    class Solution {
        public String decodeAtIndex(String S, int K) {
            long size = 0;
            final int N = S.length();
            for (int i = 0; i < N; ++i) {
                final char c = S.charAt(i);
                if (Character.isDigit(c)) size *= c - '0';
                else size++;    
            }
            for (int i = N - 1; i >= 0; --i) {
                char c = S.charAt(i);
                K %= size;
                if (K == 0 && Character.isLetter(c)) return Character.toString(c);
                if (Character.isDigit(c)) size /= c - '0';
                else size--;      
            }
            return "";
        }
    }
}
