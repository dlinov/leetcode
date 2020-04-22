package io.github.dlinov.leetcode1k;

public class Task1433CheckIfAStringCanBreakAnotherString {
    class Solution {
        public boolean checkIfCanBreak(String s1, String s2) {
            final char[] a1 = s1.toCharArray();
            final char[] a2 = s2.toCharArray();
            java.util.Arrays.sort(a1);
            java.util.Arrays.sort(a2);
            boolean r1 = a1.length == a2.length;
            boolean r2 = r1;
            for (int i = 0; (r1 || r2) && i < a1.length; ++i) {
                r1 &= a1[i] >= a2[i];
                r2 &= a2[i] >= a1[i];
            }
            return r1 || r2;
        }
    }
}