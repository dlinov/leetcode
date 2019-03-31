package io.github.dlinov.leetcode;

import java.util.*;

class Task020ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            final Set<Character> bs = new HashSet<>();
            bs.add('(');
            bs.add('{');
            bs.add('[');
            /*final Set<Character> cs = new HashSet<>();
            cs.add(')');
            cs.add('}');
            cs.add(']');*/
            final Map<Character, Character> bc = new HashMap<>();
            bc.put('(', ')');
            bc.put('{', '}');
            bc.put('[', ']');
            final int n = s.length();
            final Stack<Character> stec = new Stack<>();
            for (int i = 0; i < n; ++i) {
                final Character c = s.charAt(i);
                if (bs.contains(c)) {
                    stec.push(c);
                } else /*if (cs.contains(c))*/ {
                    if (!stec.isEmpty()) {
                        final Character toClose = stec.pop();
                        if (!bc.get(toClose).equals(c)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return stec.isEmpty();
        }
    }
}