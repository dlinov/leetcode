package io.github.dlinov.leetcode;

import java.util.*;

class Task010RegularExpressionMatching {

    // TODO:
    // "mississippi"
    // "mis*is*ip*."
    // actual: false
    // expected: true

class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        boolean notFinished = true;
        char lastToken = '\n'; // or other character guaranteed not to meet
        int lastStar = -1;
        int lastStarJ = -1;
        boolean lastChance = false;
        while (notFinished && i < s.length() && j < p.length()) {
            final char current = s.charAt(i);
            char token = p.charAt(j);
            boolean any = j + 1 < p.length() && p.charAt(j + 1) == '*';
            if (token == '.' || token == current) {
                System.out.println(String.format("'%c' matched '%c'. i=%d, j=%d", current, token, i, j));
                ++i;
                if (any) {
                    lastStar = i;
                    lastStarJ = j;
                    lastChance = true;
                    System.out.println(String.format("*. i: %d - %d, j: %d - %d", i, s.length(), j, p.length()));
                    System.out.println(j + 2 < p.length() || i == s.length());
                    if (j + 2 < p.length() || i == s.length()) {
                        j += 2;
                    }
                } else {
                    ++j;
                    lastChance = false;
                }
            } else if (any) { // when * is exactly 0
                System.out.println(String.format("'%c' did not matched '%c'*. i=%d, j=%d", current, token, i, j));
                j += 2;
                lastChance = false;
            } else {
                if (lastStar < 0 /*|| ???*/) {
                    System.out.println(String.format("'%c' did not matched '%c'*. FORCE STOP. i=%d, j=%d", current, token, i, j));
                    notFinished = false;
                    lastChance = false;
                } else {
                    i = lastStar + 1;
                    j = lastStarJ;
                    lastChance = false;
                    System.out.println(String.format("'%c' did not matched '%c'*. REVERT TO i=%d, j=%d", current, token, i, j));
                }
            }
            //specific case when not-eager matching ends too early
            if (j == p.length() && i < s.length()) {
                System.out.println(String.format("'LAST CHANCE. REVERT TO i=%d, j=%d", i, j));
                lastChance = false;
                i = lastStar + 1;
                j = lastStarJ;
            }
        }
        System.out.println(String.format("i=%d, j=%d", i, j));
        return s.length() == i && p.length() == j;
    }
}
}
