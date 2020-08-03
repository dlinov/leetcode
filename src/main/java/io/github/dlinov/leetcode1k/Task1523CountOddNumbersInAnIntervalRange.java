package io.github.dlinov.leetcode1k;

public class Task1523CountOddNumbersInAnIntervalRange {
    class Solution {
        public int countOdds(int low, int high) {
            final int result = (high - low) / 2;
            return (high % 2 == 1 || low % 2 == 1) ? result + 1 : result;
        }
    }
}