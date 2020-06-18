package io.github.dlinov.leetcode;

public class Task275HIndexII {
    class Solution {
        public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        int a = 0, b = citations.length - 1;
        while (b > a) {
            final int i = (b + a) / 2;
            if (citations[i] < citations.length - i) a = i + 1;
            else b = i;
        }
        return Math.min(citations.length - b, citations[b]);
        }
    }
}