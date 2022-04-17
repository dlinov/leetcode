package io.github.dlinov.leetcode;

class Task647PalindromicSubstrings {
    class Solution {
        public int countSubstrings(String s) {
            if (s == null || s.length() == 0) return 0;
            final int n = s.length();
            int result = 0;
            for (int i = 0; i < n; ++i) {
                result += countPalindroms(s, i);
            }
            return result;
        }

        private int countPalindroms(String s, int index) {
            final int n = s.length();
            int left = index;
            int right = index;
            int result = 0;
            // odd-sized palindroms
            while (left >= 0 && right < n) {
                if (s.charAt(left--) == s.charAt(right++)) ++result;
                else break;
            }
            // even-sized palindroms
            left = index;
            right = index + 1;
            while (left >= 0 && right < n) {
                if (s.charAt(left--) == s.charAt(right++)) ++result;
                else break;
            } 
            return result;
        }
    }
}
