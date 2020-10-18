package io.github.dlinov.leetcode;

import java.util.LinkedList;

class Task933NumberOfRecentCalls {
    class RecentCounter {
        final LinkedList<Integer> counter;
    
        public RecentCounter() {
            counter = new LinkedList<Integer>();
        }
        
        public int ping(int t) {
            counter.add(t);
            int startBorder = t - 3000;
            while (counter.getFirst() < startBorder) {
                counter.removeFirst();
            }
            return counter.size();
        }
    }
}