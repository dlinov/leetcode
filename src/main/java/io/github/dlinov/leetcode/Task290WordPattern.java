package io.github.dlinov.leetcode;

import java.util.*;

public class Task290WordPattern {
    class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] words = str.split(" ");
            if (pattern.length() != words.length) return false;
            Map<Character, String> wordMap = new HashMap<>();
            Set<String> wordSet = new HashSet<>();
            for (int i = 0; i < pattern.length(); ++i) {
                Character key = pattern.charAt(i);
                String word = words[i];
                String savedWord = wordMap.get(key);
                if (wordSet.contains(word)) {
                    if (savedWord == null || !savedWord.equals(word)) return false;
                } else if (savedWord == null) {
                    wordSet.add(word);
                    wordMap.put(key, word);
                } else return false;
            }
            return true;
        }
    }
}
