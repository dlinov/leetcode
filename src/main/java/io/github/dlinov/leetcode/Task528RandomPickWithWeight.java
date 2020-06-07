package io.github.dlinov.leetcode;

import java.util.*;

public class Task528RandomPickWithWeight {
    class Solution {
        private final TreeMap<Integer, Integer> map = new TreeMap<>();
        private final Random rnd = new Random();
        private int sum = 0;
        
        public Solution(int[] w) {
            for (int i = 0; i < w.length; i++){
                sum += w[i];
                map.put(sum, i);
            }
        }
        
        public int pickIndex() {
            return map.get(map.higherKey(rnd.nextInt(sum)));
        }
    }
}