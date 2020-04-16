package io.github.dlinov.leetcode1k;

import java.util.ArrayList;
import java.util.List;

public class Task1408StringMatchingInAnArray {
    public class Solution {
        public List<String> stringMatching(String[] words) {
            final var result = new ArrayList<String>();
            for (int i = 0; i < words.length; ++i) {
                final var wi = words[i];
                for (int j = 0; j < words.length; ++j) {
                    final var wj = words[j];
                    if (i != j && wi.length() <= wj.length() && wj.contains(wi)) {
                        result.add(wi);
                        break;
                    }
                }
            }
            return result;
        }
    }
}