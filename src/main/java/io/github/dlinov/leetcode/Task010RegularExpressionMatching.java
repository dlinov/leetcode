package io.github.dlinov.leetcode;

import java.util.*;

class Task010RegularExpressionMatching {
    class Solution {
        public boolean isMatch(String s, String p) {
            if (p == ".*") {
                return true;
            } else {
                int pIndex = 0;
                char token = p.charAt(pIndex);
                int tokenQ = p.charAt(pIndex + 1);
                for (int i = 0; i <= s.length(); ++i) {

                }
            }
        }
    }
}
