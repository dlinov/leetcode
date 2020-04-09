package io.github.dlinov.leetcode;

public class Task844BackspaceStringCompare {
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            final int sSize = S.length();
            final int tSize = T.length();
            char[] s = new char[sSize], t = new char[tSize];
            java.util.Arrays.fill(s, ' ');
            java.util.Arrays.fill(t, ' ');
            int sResLength = 0, tResLength = 0;
            for (int i = 0; i < sSize; ++i) {
               final char ch = S.charAt(i);
               if (ch != '#') {
                    s[sResLength++] = ch;
               } else {
                    sResLength = Math.max(sResLength - 1, 0);
                    s[sResLength] = ' ';
               }
            }
            for (int i = 0; i < tSize; ++i) {
                final char ch = T.charAt(i);
                if (ch != '#') {
                    t[tResLength++] = ch;
                } else {
                    tResLength = Math.max(tResLength - 1, 0);
                    t[tResLength] = ' ';
                }
            }
            if (sResLength != tResLength) {
                return false;
            }
            for (int i = 0; i < sResLength; ++i) {
                if (s[i] != t[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}