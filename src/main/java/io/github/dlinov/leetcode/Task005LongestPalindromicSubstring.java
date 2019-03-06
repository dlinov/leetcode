package io.github.dlinov.leetcode;

import java.util.*;

public class Task005LongestPalindromicSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            final int n = s.length();
            String result = "";
            for (int i = 0; i < n; ++i) {
                for (int j = 0; i - j >= 0 && i + j < n; ++j) {
                    final int l = i - j;
                    final int r = i + j;
                    if (s.charAt(l) == s.charAt(r)) {
                        if (result.length() <= r + 1 - l) {
                            result = s.substring(l, r + 1);
                        }
                    } else {
                        break;
                    }
                }
            }
            for (int i = 0; i < n - 1; ++i) {
                for (int j = 0; i - j >= 0 && i + 1 + j < n; ++j) {
                    final int l = i - j;
                    final int r = i + j + 1;
                    if (s.charAt(l) == s.charAt(r)) {
                        if (result.length() <= r + 1 - l) {
                            result = s.substring(l, r + 1);
                        }
                    } else {
                        break;
                    }
                }
            }
            return result;
        }
    }
}