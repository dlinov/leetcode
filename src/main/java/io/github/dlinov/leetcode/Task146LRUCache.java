package io.github.dlinov.leetcode;

import java.util.*;

public class Task146LRUCache {
    class LRUCache {
        private Map<Integer, Integer> cache;

        public LRUCache(int capacity) {
            cache = new LinkedHashMap<>(capacity, 2f, true) {
                private static final long serialVersionUID = 5794325341667286759L;

                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    return size() > capacity;
                }
            };
        }
        
        public int get(int key) {
            return cache.getOrDefault(key, -1);
        }
        
        public void put(int key, int value) {
            cache.put(key, value);
        }
    }
}