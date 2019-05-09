package io.github.dlinov.leetcode;

import java.util.*;

public class Task338CountingBits {
    class Solution {
        public int[] countBits(int num) {
            int[] results = new int[num + 1];
            for (int i = 1; i <= num; ++i) {
                results[i] = results[i / 2] + i % 2;
            }
            return results;
        }
    }
}
