package io.github.dlinov.leetcode;

class Task008StringToInteger {
    class Solution {
        public int myAtoi(String str) {
            final int n = str.length();
            int result = 0;
            int m = 1;
            boolean isInProgress = false;
            for (int i = 0; i < n; ++i) {
                final char ch = str.charAt(i);
                final boolean isNum = ch >= '0' && ch <= '9';
                if (isNum) {
                    if (!isInProgress) {
                        isInProgress = true;
                    }
                    final int num = ch - '0';
                    final int tmp = result * 10 + num * m;
                    if (Math.abs(tmp) < 100 || tmp / result == 10) {
                        result = tmp;
                    } else {
                        if (m > 0) {
                            return Integer.MAX_VALUE;
                        }
                        return Integer.MIN_VALUE;
                    }
                } else if (isInProgress) {
                    return result;
                } else if (ch == '-') {
                    isInProgress = true;
                    m = -1;
                } else if (ch == '+') {
                    isInProgress = true;
                } else if (ch != ' ') {
                    return result;
                }
            }
            if (m > 0 && result < 0) {
                return Integer.MAX_VALUE;
            }
            return result;
        }
    }
}