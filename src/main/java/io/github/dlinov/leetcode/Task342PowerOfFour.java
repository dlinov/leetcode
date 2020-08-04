package io.github.dlinov.leetcode;

public class Task342PowerOfFour {
    class Solution {
        public boolean isPowerOfFour(int num) {
            return (num & (num - 1)) == 0 && num % 3 == 1;
        }
    }
}