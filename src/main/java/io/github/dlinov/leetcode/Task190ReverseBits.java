package io.github.dlinov.leetcode;

public class Task190ReverseBits {
    class Solution {
        public int reverseBits(int n) {
            int result = 0;
            int src = n;
            while (src != 0) {
                int lastBit = src & 1;
                result <<= 1;
                result |= lastBit;
                src >>= 1;
            }
            return result;
        }
    }
}
