package io.github.dlinov.leetcode;

public class Task461HammingDistance {
    class Solution {
        public int hammingDistance(int x, int y) {
            int result = 0;
            int z = x ^ y;
            while (z > 0) {
                result += z % 2;
                z /= 2;
            }
            return result;
        }
    }
}