package io.github.dlinov.leetcode;

import java.util.Arrays;

public class Task593ValidSquare {
    class Solution {
        public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
            return checkDist(p1, p2, p3, p4) &&
                    checkDist(p2, p3, p4, p1) &&
                    checkDist(p3, p4, p1, p2) &&
                    checkDist(p4, p1, p2, p3); 
        }
        
        private boolean checkDist(int[] p1, int[] p2, int[] p3, int[] p4) {
            final int[] dists = new int[3];
            dists[0] = dist(p1, p2);
            dists[1] = dist(p1, p3);
            dists[2] = dist(p1, p4);
            Arrays.sort(dists);
            return dists[0] == dists[1] && dists[0] + dists[1] == dists[2] && dists[2] != 0;
        }
        
        private int dist(int[] p0, int[] p1) {
            final int x1 = p1[0] > p0[0] ? p1[0] : p0[0];
            final int x2 = p1[0] > p0[0] ? p0[0] : p1[0];
            final int y1 = p1[1] > p0[1] ? p1[1] : p0[1];
            final int y2 = p1[1] > p0[1] ? p0[1] : p1[1];
            return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        }
    }
}
