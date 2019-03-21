package io.github.dlinov.leetcode;

import java.util.*;

class Task011ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int r = height.length - 1;
            int l = 0;
            int max = 0;
            while (l < r) {
                int h1 = height[l];
                int h2 = height[r];
                max = Math.max(max, Math.min(h1, h2) * (r - l));
                if (h1 < h2) {
                    ++l;
                } else {
                    --r;
                }
            }
            return max;
        }
    }
}