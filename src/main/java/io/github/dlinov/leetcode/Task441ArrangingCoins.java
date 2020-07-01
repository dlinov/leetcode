package io.github.dlinov.leetcode;

public class Task441ArrangingCoins {
    class Solution {
        public int arrangeCoins(int n) {
            int k = 0;
            int addition = 0;
            while (n - k > addition) {
                k += ++addition;
            }
            return addition;
        }
    }
}