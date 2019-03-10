package io.github.dlinov.leetcode;

import java.util.*;

public class Task006ZigZagConversion {
    class Solution {
        public String convert(String s, int numRows) {
            if (s.isEmpty() || numRows < 2) {
                return s;
            }
            final int n = s.length();
            final int unitSize = numRows * 2 - 2; // every zigzag unit has 2 letters by row except first and last ones
            final int maxUnits = n / unitSize + 1;
            final StringBuilder sb = new StringBuilder(n);
            for (int r = 0; r < numRows; ++r) {
                final boolean isTopOrBottomRow = r == 0 || r == numRows - 1;
                for (int u = 0; u < maxUnits; ++u) {
                    final int i = u * unitSize + r;
                    if (i < n) {
                        final char ch1 = s.charAt(i);
                        sb.append(ch1);
                    }
                    if (!isTopOrBottomRow) {
                        final int i2 = u * unitSize + (unitSize - r);
                        if (i2 < n) {
                            final char ch = s.charAt(i2);
                            sb.append(ch);
                        }
                    }
                }
            }
            return sb.toString();
        }
    }
}