package io.github.dlinov.leetcode;

import java.util.*;

public class Task380InsertDeleteGetRandomO1 {
    class RandomizedSet {

        private final List<Integer> elems;
        private final Map<Integer, Integer> elemsMap;
        private final Random rnd;

        /** Initialize your data structure here. */
        public RandomizedSet() {
            rnd = new Random();
            elems = new ArrayList<>();
            elemsMap = new HashMap<>();
        }
        
        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if (elemsMap.containsKey(val)) return false;
            elems.add(val);
            elemsMap.put(val, elems.size() - 1);
            return true;
        }
        
        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if (!elemsMap.containsKey(val)) return false;
            final int index = elemsMap.get(val);
            final int last = elems.get(elems.size() - 1);
            elems.set(index, last);
            elemsMap.put(last, index);
            elemsMap.remove(val);
            elems.remove(elems.size() - 1);
            return true;
        }
        
        /** Get a random element from the set. */
        public int getRandom() {
            return elems.get(rnd.nextInt(elems.size()));
        }
    }
    
    /**
     * Your RandomizedSet object will be instantiated and called as such:
     * RandomizedSet obj = new RandomizedSet();
     * boolean param_1 = obj.insert(val);
     * boolean param_2 = obj.remove(val);
     * int param_3 = obj.getRandom();
     */
}