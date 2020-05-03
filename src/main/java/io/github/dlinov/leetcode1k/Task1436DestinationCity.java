package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1436DestinationCity {
    class Solution {
        public String destCity(List<List<String>> paths) {
            final Set<String> src = new HashSet<>();
            final Set<String> dst = new HashSet<>();
            for (List<String> path : paths) {
                src.add(path.get(0));
                dst.add(path.get(1));
            }
            dst.removeAll(src);
            return dst.iterator().next();
        }
    }
}