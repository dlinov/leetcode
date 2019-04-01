package io.github.dlinov.leetcode;

import java.util.*;

class Task022GenerateParentheses {
    class Solution {
        public List<String> generateParenthesis(int n) {
            final List<String> results = new ArrayList<>();
            inner(results, "", n, 0, 0);
            return results;
        }

        void inner(List<String> list, String acc, int rem, int opened, int closed) {
            if (rem == 0 && opened == closed) {
                list.add(acc);
            } else {
                if (rem > 0) {
                    inner(list, acc + '(', rem - 1, opened + 1, closed);
                }
                if (opened > closed) {
                    inner(list, acc + ')', rem, opened, closed + 1);
                }
            }
        }
    }
}