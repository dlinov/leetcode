package io.github.dlinov.leetcode1k;

import java.util.Stack;

public class Task1417ReformatTheString {
    class Solution {
        public String reformat(String s) {
            if (s.isEmpty()) return s;
            final Stack<Character> digits = new Stack<>();
            final Stack<Character> letters = new Stack<>();
            int nDigits = 0;
            int nLetters = 0;
            for (int i = 0; i < s.length(); ++i) {
                final char ch = s.charAt(i);
                boolean isCurrDigit = Character.isDigit(ch);
                if (isCurrDigit) {
                    ++nDigits;
                    digits.push(ch);
                } else {
                    ++nLetters;
                    letters.push(ch);
                }
            }
            final int diff = nDigits - nLetters;
            if (Math.abs(diff) > 1) return "";
            boolean isLastLetter = diff > 0;
            char[] chars = new char[s.length()];
            for (int i = 0; i < s.length(); ++i) {
                chars[i] = (isLastLetter ? digits : letters).pop();
                isLastLetter = !isLastLetter;
            }
            return new String(chars);
        }
    }
}