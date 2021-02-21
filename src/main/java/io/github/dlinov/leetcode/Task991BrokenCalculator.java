package io.github.dlinov.leetcode;

public class Task991BrokenCalculator {
    class Solution {
        public int brokenCalc(int X, int Y) {
            int ans = 0;
            while (Y > X) {
                ans++;
                if (Y % 2 == 1) Y++;
                else Y /= 2;
            }
            return ans + X - Y;
        }
    }
}
