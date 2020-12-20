package io.github.dlinov.leetcode;

import java.util.*;

public class Task804UniqueMorseCodesWords {
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            final String[] morse = new String[] {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."
            };
            final Set<String> transformations = new HashSet<>();
            final StringBuilder sb = new StringBuilder();
            for (String w : words) {
                for (int i = 0; i < w.length(); ++i) {
                    sb.append(morse[w.charAt(i) - 'a']);
                }
                transformations.add(sb.toString());
                sb.setLength(0);
            }
            return transformations.size();
        }
    }
}
