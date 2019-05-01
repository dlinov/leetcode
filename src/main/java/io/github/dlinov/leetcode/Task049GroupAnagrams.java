package io.github.dlinov.leetcode;

import java.util.*;

class Task049GroupAnagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            final Map<String, List<String>> resultsMap = new HashMap<>();
            for (int i = 0; i < strs.length; ++i) {
                final String s = strs[i];
                final char[] chars = s.toCharArray();
                Arrays.sort(chars);
                final String sorted = new String(chars);
                if (!resultsMap.containsKey(sorted)) {
                    final List<String> list = new ArrayList<>();
                    resultsMap.put(sorted, list);
                }
                resultsMap.get(sorted).add(s);
            }
            final List<String> keys = new ArrayList<>(resultsMap.keySet());
            final List<List<String>> results = new ArrayList<>(keys.size());
            for (String k: keys) {
                results.add(resultsMap.get(k));
            }
            return results;
        }
    }
}
