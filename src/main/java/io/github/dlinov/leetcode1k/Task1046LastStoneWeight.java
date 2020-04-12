package io.github.dlinov.leetcode1k;

import java.util.Arrays;

public class Task1046LastStoneWeight {
    class Solution {
        public int lastStoneWeight(int[] stones) {
            int stonesCount;
            while (stones.length > 1) {
                stonesCount = stones.length;
                Arrays.sort(stones);
                final int heavy1 = stones[stonesCount - 1];
                final int heavy2 = stones[stonesCount - 2];
                final int heavyDiff = heavy1 - heavy2;
                int[] stonesDst;
                if (heavyDiff > 0) {
                    stonesDst = new int[stonesCount - 1];
                    System.arraycopy(stones, 0, stonesDst, 0, stonesCount - 2);
                    stonesDst[stonesDst.length - 1] = heavyDiff;
                } else {
                    stonesDst = new int[stonesCount - 2];
                    System.arraycopy(stones, 0, stonesDst, 0, stonesCount - 2);
                }
                stones = stonesDst;
            }
            return stones.length == 0 ? 0 : stones[0];
            
            // Better time complexity (n*log(n) vs. n^2*log(n)) but actually runs slower for test data
            /*
            import java.util.Collections;
            import java.util.PriorityQueue;
            var pq = new PriorityQueue<Integer>(stones.length, Collections.reverseOrder());
            for (int i = 0; i < stones.length; ) {
                pq.add(stones[i++]);
            }
            while (pq.size() > 1) {
                var heavy1 = pq.poll();
                var heavy2 = pq.poll();
                var hDiff = heavy1 - heavy2;
                if (hDiff > 0) {
                    pq.add(hDiff);
                }
            }
            return pq.isEmpty() ? 0 : pq.peek();
            */
        }
    }
}