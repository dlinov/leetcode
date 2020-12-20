package io.github.dlinov.leetcode;

public class Task605CanPlaceFlowers {
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int x = 0;
            boolean first = true;
            for (int i = 0; i < flowerbed.length; ++i) {
                if (n <= 0) break;
                if (flowerbed[i] == 1) {
                    n -= (x - (first ? 0 : 1)) / 2;
                    x = 0;
                    first = false;
                } else {
                    ++x;
                }
            }
            n -= (x + (first ? 1 : 0)) / 2;
            return n <= 0;
        }
    }
}
