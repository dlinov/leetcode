package io.github.dlinov.leetcode1k;

public class Task1641CountSortedVowelStrings {
    class Solution {
        public int countVowelStrings(int n) {
            return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
        }
    }
}
