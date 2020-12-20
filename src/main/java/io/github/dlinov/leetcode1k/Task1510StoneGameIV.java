package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1510StoneGameIV {
    class Solution {
        public boolean winnerSquareGame(int n) {
            final Map<Integer, Boolean> cache = new HashMap<>();
            cache.put(0, false);
            return dfs(cache, n);
        }
    
        public boolean dfs(Map<Integer, Boolean> cache, int remain) {
            if (cache.containsKey(remain)) return cache.get(remain);
            int sqrtRem = (int) Math.sqrt(remain);
            for (int i = 1; i <= sqrtRem; i++) {
                if (!dfs(cache, remain - i * i)) {
                    cache.put(remain, true);
                    return true;
                }
            }
            cache.put(remain, false);
            return false;
        }
    }
}
