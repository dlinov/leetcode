package io.github.dlinov.leetcode;

import java.util.PriorityQueue;

public class Task215KthLargestElementInAnArray {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(k);
            for (int n : nums) {
                pq.offer(n);
                if (pq.size() > k) pq.poll();
            }
            return pq.peek();
        }
    }
}
