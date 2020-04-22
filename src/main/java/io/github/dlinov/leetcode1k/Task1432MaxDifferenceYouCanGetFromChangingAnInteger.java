package io.github.dlinov.leetcode1k;

import java.math.BigInteger;

public class Task1432MaxDifferenceYouCanGetFromChangingAnInteger {
    class Solution {
        public int maxDiff(int num) {
            int a = num;
            String sNum = Integer.toString(num);
            final int snl = sNum.length();
            char tbr = 'x';
            for (int i = 0; i < snl; ++i) {
                char curr = sNum.charAt(i);
                if (curr != '9' && tbr == 'x') {
                    tbr = curr;
                }
                if (curr == tbr) {
                    a += BigInteger.TEN.pow(snl - i - 1).intValue() * ('9' - tbr);
                }
            }
            final char first = sNum.charAt(0);
            char trg = '0';
            int b = num;
            tbr = 'x';
            for (int i = 0; i < snl; ++i) {
                char curr = sNum.charAt(i);
                if (tbr == 'x' && curr != '0') {
                    if (curr == first && first == '1') {
                        continue;
                    } else if (first != '1') {
                        trg = '1';
                        tbr = curr;
                    } else {
                        tbr = curr;
                    }
                }
                if (curr == tbr) {
                    b -= BigInteger.TEN.pow(snl - i - 1).intValue() * (tbr - trg);
                }
            }
            if (b == 0) b = 1;
            return a - b;
        }
    }
}