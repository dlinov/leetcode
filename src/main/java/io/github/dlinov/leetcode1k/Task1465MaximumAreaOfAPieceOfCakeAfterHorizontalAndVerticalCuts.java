package io.github.dlinov.leetcode1k;

import java.util.Arrays;

public class Task1465MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {
    class Solution {
        public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
            Arrays.sort(horizontalCuts);
            Arrays.sort(verticalCuts);
            int xmax = 0;
            int ymax = 0;
            for (int i = 0; i <= horizontalCuts.length; ++i) {
                int x0 = i == 0 ? 0 : horizontalCuts[i - 1];
                int x1 = i == horizontalCuts.length ? h : horizontalCuts[i];
                xmax = Math.max(x1 - x0, xmax);
            }
            for (int j = 0; j <= verticalCuts.length; ++j) {
                int y0 = j == 0 ? 0 : verticalCuts[j - 1];
                int y1 = j == verticalCuts.length ? w : verticalCuts[j];
                ymax = Math.max(ymax, (y1 - y0));
            }
            return (int)((long)xmax * (long)ymax % 1000000007);
        }
    }
}