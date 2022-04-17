package io.github.dlinov.leetcode;

class Task125ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            var sb = new StringBuilder();
            for (int i = 0; i < s.length(); ++i) {
                final char ch = s.charAt(i);
                if (Character.isLetterOrDigit(ch)) {
                    sb.append(Character.toLowerCase(ch));
                }
            }
            var prepared = sb.toString();
            var n = prepared.length();
            var left = n / 2;
            if (n % 2 == 0) --left;
            var right = n / 2;
            var result = true;
            while (result && left >= 0 && right < n) {
                result &= prepared.charAt(left--) == prepared.charAt(right++);
            }
            return result;
        }
    }
}
