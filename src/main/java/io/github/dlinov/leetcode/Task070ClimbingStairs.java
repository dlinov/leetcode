package io.github.dlinov.leetcode;

public class Task070ClimbingStairs {
    class Solution {
        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            int p1 = 1;
            int p2 = 2;
            for (int i = 2; i < n; ++i)  {
                int next = p1 + p2;
                p1 = p2;
                p2 = next;
            }
            return p2;
        }
    }
}
