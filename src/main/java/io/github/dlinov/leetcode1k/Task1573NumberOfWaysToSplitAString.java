package io.github.dlinov.leetcode1k;

import java.util.*;

class Task1573NumberOfWaysToSplitAString {
    class Solution {
        public int numWays(String s) {
            final int c = 1000000007;
            int n = 0;
            List<Integer> intervals = new ArrayList<>();
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == '1') {
                    n++;
                    intervals.add(i);
                }
            }
            if (n % 3 != 0) {
                return 0;
            }
            n /= 3;
            if (n == 0) {
                int sum = 0;
                int sn = s.length() - 2;
                while (sn > 0) {
                    sum += sn--;
                    sum %= c;
                }
                return sum;
            } else {
                long x = intervals.get(n) - intervals.get(n - 1);
                long y = intervals.get(2 * n) - intervals.get(2 * n - 1);
                return (int)(((x % c) * (y % c)) % c);
            }
        }
    }
}