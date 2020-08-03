package io.github.dlinov.leetcode;

import java.util.BitSet;

public class Task705DesignHashSet {
    class MyHashSet {
    
        private final BitSet set;
    
        /** Initialize your data structure here. */
        public MyHashSet() {
            set = new BitSet(1000001);
        }
        
        public void add(int key) {
            set.set(key);
        }
        
        public void remove(int key) {
            set.set(key, false);
        }
        
        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            return set.get(key);
        }
    }
    
    /**
     * Your MyHashSet object will be instantiated and called as such:
     * MyHashSet obj = new MyHashSet();
     * obj.add(key);
     * obj.remove(key);
     * boolean param_3 = obj.contains(key);
     */
}