package io.github.dlinov.leetcode;

class Task043MultiplyStrings {
    class Solution {
        public String multiply(String num1, String num2) {
            int[] n3 = new int[num1.length() + num2.length()];
            int inMind = 0;
            for (int j = num2.length() - 1; j >= 0; --j) {
                final int d2 = num2.charAt(j) - '0';
                for (int i = num1.length() - 1; i >= 0; --i) {
                    int ni = n3.length - 2 - i - j;
                    int m = (num1.charAt(i) - '0') * d2 + inMind + n3[ni];
                    n3[ni] = m % 10;
                    inMind = m / 10;
                }
                if (inMind != 0) {
                    n3[n3.length - 1 - j] = inMind;
                    inMind = 0;
                }
            }
            StringBuilder sb = new StringBuilder(n3.length);
            boolean stillPadding = true;
            for (int i = n3.length - 1; i >= 0; --i) {
                int curr = n3[i];
                if (stillPadding) {
                    if (curr != 0) {
                        stillPadding = false;
                    } else {
                        continue;
                    }
                }
                sb.append(curr);
            }
            final String result = sb.toString();
            if (result.length() < 1) {
                return "0";
            }
            return result;
        }
    }
}