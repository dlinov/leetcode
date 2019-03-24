package io.github.dlinov.leetcode;

import java.util.*;

class Task014LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) {
                return "";
            }
            return lcp(strs, 0, strs.length - 1);
        }

        String lcp(String[] strs, int lBound, int rBound) {
            if (lBound == rBound) {
                return strs[lBound];
            } else {
                int mid = (rBound + lBound) / 2;
                return mergePrefixes(lcp(strs, lBound, mid), lcp(strs, mid + 1, rBound));
            }
        }

        String mergePrefixes(String p1, String p2) {
            final int min = Math.min(p1.length(), p2.length());
            int i = 0;
            while (i < min && p1.charAt(i) == p2.charAt(i)) {
                ++i;
            }
            return p1.substring(0, i);
        }
    }
}