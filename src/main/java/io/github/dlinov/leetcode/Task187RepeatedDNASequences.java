package io.github.dlinov.leetcode;

import java.util.*;
import java.util.stream.*;

public class Task187RepeatedDNASequences {
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            final Map<String, Integer> freqs = new HashMap<>();
            for (int i = 0; i <= s.length() - 10; ++i) {
                freqs.compute(s.substring(i, i + 10), (k, v) -> (v == null) ? 1 : v + 1);
            }
            return freqs.entrySet().stream()
                .filter(kv -> kv.getValue() > 1)
                .map(kv -> kv.getKey())
                .collect(Collectors.toList());
        }
    }
}
