package io.github.dlinov.leetcode;

import java.util.Stack;

public class Task155MinStack {
    class MinStack {
        
        private class Pair {
            int x;
            int min;

            public Pair(int x, int min) {
                this.x = x;
                this.min = min;
            }
        }
        
        private Stack<Pair> inner;
    
        public MinStack() {
            inner = new Stack<>();
        }
        
        public void push(int x) {
            final int min = inner.empty() ? x : Math.min(inner.peek().min, x);
            inner.push(new Pair(x, min));
        }
        
        public void pop() {
            inner.pop();
        }
        
        public int top() {
            return inner.peek().x;
        }
        
        public int getMin() {
            return inner.peek().min;
        }
    }
}