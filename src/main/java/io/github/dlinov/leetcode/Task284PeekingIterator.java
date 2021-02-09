package io.github.dlinov.leetcode;

import java.util.Iterator;

public class Task284PeekingIterator {
    // Java Iterator interface reference:
    // https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

    class PeekingIterator implements Iterator<Integer> {
        private Integer preNext;
        private Iterator<Integer> iter;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            preNext = null;
            iter = iterator;
        }
        
        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            if (preNext == null) preNext = iter.next();
            return preNext;
        }
        
        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer result;
            if (preNext != null) {
                result = preNext;
                preNext = null;
            } else {
                result = iter.next();
            }
            return result;
        }
        
        @Override
        public boolean hasNext() {
            return preNext != null || iter.hasNext();
        }
    }
}
