package io.github.dlinov.leetcode1k;

public class Task1663SmallestStringWithAGivenNumericValue {
    class Solution {
        public String getSmallestString(int n, int k) {
            final StringBuilder result = new StringBuilder();
            final char[] alphabet = {
                'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'
            };
            int remN = n, remK = k;
            while (remN > 0) {
                final int diff = Math.min(remK - remN, 25);
                final char next = alphabet[diff];
                result.append(next);
                remN--;
                remK -= diff + 1;
            }
            return result.reverse().toString();
        }
    }
}
