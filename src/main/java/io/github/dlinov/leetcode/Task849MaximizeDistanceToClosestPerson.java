package io.github.dlinov.leetcode;

public class Task849MaximizeDistanceToClosestPerson {
    class Solution {
        public int maxDistToClosest(int[] seats) {
            int maxDist = -1;
            int left = seats[0] == 0 ? Integer.MIN_VALUE : 0;
            int right = left;
            for (int i = 0; i < seats.length; ++i) {
                if (seats[i] == 1) {
                    right = i;
                    int dist = left == Integer.MIN_VALUE ? right : (right - left) / 2;
                    if (dist > maxDist) maxDist = dist;
                    left = i;
                }
            }
            if (seats[seats.length - 1] == 0) {
                maxDist = Math.max(maxDist, seats.length - 1 - left);
            }
            return maxDist;
        }
    }
}
