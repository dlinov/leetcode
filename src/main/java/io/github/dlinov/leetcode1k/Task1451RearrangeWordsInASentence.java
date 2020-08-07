package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1451RearrangeWordsInASentence {
    class Solution {
        public String arrangeWords(String text) {
        String[] words = text.split(" ");
        int[] lengths = new int[words.length];
        Map<Integer, Queue<String>> wordsMap = new HashMap<>();
        for (int i = 0; i < words.length; ++i) {
            lengths[i] = words[i].length();
            Queue<String> sameLengthList = wordsMap.get(lengths[i]);
            if (sameLengthList == null) {
                sameLengthList = new LinkedList<>();
                wordsMap.put(lengths[i], sameLengthList);
            }
            sameLengthList.add(words[i]);
        }
        Arrays.sort(lengths);
        StringBuilder sb = new StringBuilder(text.length());
        for (int i = 0; i < lengths.length; ++i) {
            Queue<String> q = wordsMap.get(lengths[i]);
            if (i != 0) {
                sb.append(q.poll().toLowerCase());
            } else {
                String word = q.poll();
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1));
            }
            if (i + 1 != lengths.length) {
                sb.append(' ');
            }
        }
        return sb.toString();
        }
    }
}