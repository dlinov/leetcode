package io.github.dlinov.leetcode;

import java.util.ArrayDeque;

public class Task239SlidingWindowMaximum {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || k <= 0) return new int[0];
            int[] res = new int[nums.length - k + 1];
            final ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
            int index = 0;
            for (int i = 0; i < nums.length; i++) { 
                while (!deque.isEmpty() && deque.peek() < i - k + 1) deque.poll();
                while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.pollLast();
                deque.offer(i);
                if (i >= k - 1) res[index++] = nums[deque.peek()];
            }
            return res;
        }
    }
}
