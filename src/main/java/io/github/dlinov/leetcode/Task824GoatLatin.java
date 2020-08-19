package io.github.dlinov.leetcode;

import java.util.Arrays;
import java.util.Set;

public class Task824GoatLatin {
    class Solution {
    public String toGoatLatin(String S) {
        final String[] words = S.split(" ");
        final StringBuilder sb = new StringBuilder();
        final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        final char[] aBuf = new char[words.length];
        Arrays.fill(aBuf, 'a');
        for (int i = 0; i < words.length; ++i) {
            if (i != 0) sb.append(' ');
            final char first = words[i].charAt(0);
            if (vowels.contains(Character.toLowerCase(first))) {
                sb.append(words[i]);
            } else {
                sb.append(words[i].substring(1));
                sb.append(first);
            }
            sb.append("ma");
            sb.append(aBuf, 0, i + 1);
        }
        return sb.toString();
    }
    }
}