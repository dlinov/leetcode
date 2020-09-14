package io.github.dlinov.leetcode;

public class Task165CompareVersionNumbers {
    class Solution {
        public int compareVersion(String version1, String version2) {
            final String[] v1 = version1.split("\\.");
            final String[] v2 = version2.split("\\.");
            final int n = Math.max(v1.length, v2.length);
            for (int i = 0; i < n; ++i) {
                final int p1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
                final int p2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
                if (p1 != p2) return p1 > p2 ? 1 : -1; 
            }
            return 0;
        }
    }
}
