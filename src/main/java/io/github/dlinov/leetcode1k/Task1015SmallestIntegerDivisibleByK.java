package io.github.dlinov.leetcode1k;

public class Task1015SmallestIntegerDivisibleByK {
    class Solution {
        public int smallestRepunitDivByK(int K) {
            if (K % 2 == 0 || K % 5 == 0) return -1;
            int remainder = 0;
            for (int lengthN = 1; lengthN <= K; lengthN++) {
                remainder = (remainder * 10 + 1) % K;
                if (remainder == 0) return lengthN;
            }
            return -1;
        }
    }
}
