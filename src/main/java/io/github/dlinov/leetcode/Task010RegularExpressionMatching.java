package io.github.dlinov.leetcode;

import java.util.*;

class Task010RegularExpressionMatching {
    private final static String inputTemplate = "Test if %s matches %s...";
    private final static String outputTemplate = "\tactual: %b, expected: %b";
    private static int overall = 0;
    private static int passed = 0;

    public static void main(String[] args) {
      final Solution s = new Solution();
    //   test(s, "aa", "a", false);
    //   test(s, "aa", "a*", true);
    //   test(s, "aab", "a*b", true);
    //   test(s, "aab", "a.b", true);
    //   test(s, "aab", "a.*b", true);
    //   test(s, "aab", "a.*c", false);
    //   test(s, "mississippi", "mis*is*p*.", false);
    //   test(s, "mississippi", "mis*is*ip*.", true);
    //   test(s, "aaa", "a*a", true);
    //   test(s, "a", "ab*", true);
      test(s, "bbbba", ".*a*a", true);
      System.out.println(String.format("\n=======\n%d tests passed out of %d", passed, overall));
    }

    static void debug(String msg) {
        System.out.println("\t" + msg);
    }

    static void test(Solution solution, String s, String p, boolean expected) {
        ++overall;
        try {
            System.out.println(String.format(inputTemplate, s, p));
            final boolean actual = solution.isMatch(s, p);
            if (actual == expected) {
                ++passed;
            }
            System.out.println(String.format(outputTemplate, actual, expected));
        } catch (Exception exc) {
            System.err.println(exc.getMessage());
            exc.printStackTrace();
        }
    }

static class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        boolean notFinished = true;
        int lastStar = -1;
        int lastStarJ = -1;
        int lastStarReversedI = -1;
        while (notFinished && i < s.length() && j < p.length()) {
            final char current = s.charAt(i);
            final char token = p.charAt(j);
            final boolean any = j + 1 < p.length() && p.charAt(j + 1) == '*';
            if (token == '.' || token == current) {
                debug(String.format("'%c' matched token '%c'. i=%d, j=%d", current, token, i, j));
                ++i;
                if (any) {
                    lastStar = i;
                    lastStarJ = j;
                    debug(String.format("\t*. i=%d(%d), j=%d(%d)", i, s.length(), j, p.length()));
                    debug(String.format("\t%b", j + 2 < p.length() || i == s.length()));
                    if (j + 2 < p.length() || i == s.length()) {
                        j += 2;
                    }
                } else {
                    ++j;
                }
            } else if (any) { // when * is exactly 0
                debug(String.format("'%c' did not match token '%c'*. i=%d, j=%d", current, token, i, j));
                j += 2;
            } else {
                if (lastStar < 0) {
                    debug(String.format("'%c' did not match token '%c'*. FORCE STOP. i=%d, j=%d", current, token, i, j));
                    notFinished = false;
                } else {
                    i = lastStar;
                    j = lastStarJ;
                    debug(String.format("'%c' did not match token '%c'*. REVERT TO i=%d, j=%d", current, token, i, j));
                }
            }
            //specific case when not-eager matching ends too early
            if (j == p.length() && i < s.length() && lastStar > -1 && lastStarReversedI != lastStar) {
                debug(String.format("LAST CHANCE. REVERT TO i=%d, j=%d", lastStar, lastStarJ));
                i = lastStar;
                lastStarReversedI = i;
                j = lastStarJ;
            }
        }
        if (i >= s.length() && j + 1 < p.length() && p.charAt(j + 1) == '*') {
            debug(String.format("Trying to replace any * with exact 0; i=%d, j=%d, nextJ=%d", i, j, j + 2));
            j += 2;
        }
        debug(String.format("i=%d, j=%d", i, j));
        return s.length() == i && p.length() == j;
    }
}
}
