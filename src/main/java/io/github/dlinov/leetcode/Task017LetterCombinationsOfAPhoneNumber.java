package io.github.dlinov.leetcode;

import java.util.*;

class Task017LetterCombinationsOfAPhoneNumber {
    class Solution {
        public List<String> letterCombinations(String digits) {
            final int n = digits.length();
            final List<String> results = new ArrayList<>(512);
            final Map<Character, char[]> buttons = new HashMap<>(16);
            buttons.put('2', new char[] {'a', 'b', 'c'});
            buttons.put('3', new char[] {'d', 'e', 'f'});
            buttons.put('4', new char[] {'g', 'h', 'i'});
            buttons.put('5', new char[] {'j', 'k', 'l'});
            buttons.put('6', new char[] {'m', 'n', 'o'});
            buttons.put('7', new char[] {'p', 'q', 'r', 's'});
            buttons.put('8', new char[] {'t', 'u', 'v'});
            buttons.put('9', new char[] {'w', 'x', 'y', 'z'});
            innerCombinations(buttons, results, digits, "");
            return results;
        }

        public void innerCombinations(Map<Character, char[]> buttons, List<String> results, String rem, String acc) {
            if (rem.isEmpty()) {
                if (!acc.isEmpty()) {
                    results.add(acc);
                }
            } else {
                final char digit = rem.charAt(0);
                final char[] letters = buttons.get(digit);
                final String newRem = rem.substring(1);
                for (int i = 0; i < letters.length; ++i) {
                    innerCombinations(buttons, results, newRem, acc + letters[i]);
                }
            }
        }
    }
}