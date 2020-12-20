package io.github.dlinov.leetcode;

import java.util.*;

public class Task218TheSkylineProblem {
    class Solution {
        public List<List<Integer>> getSkyline(int[][] buildings) {
            final TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int[] b : buildings) {
                int l = b[0];
                int r = b[1];
                int h = b[2];
                final Integer rightFloor = map.floorKey(r);
                if (rightFloor == null || map.get(rightFloor) < h) {
                    map.put(r, rightFloor == null ? 0 : map.get(rightFloor));
                }
                final Integer leftFloor = map.floorKey(l);
                if (leftFloor == null || map.get(leftFloor) < h) map.put(l, h);
                List<Integer> delete = new ArrayList<>();
                for (Integer loc : map.subMap(l + 1, r).keySet()) {
                    if (map.get(loc) < h)  {
                        if (map.lowerEntry(loc) != null && map.lowerEntry(loc).getValue() > h) {
                            map.put(loc, h);                            
                        } else {
                            delete.add(loc);
                        }
                    }
                }
                map.keySet().removeAll(delete);
            }
            final List<List<Integer>> ans = new ArrayList<>();
            for (Integer loc : map.keySet()) {
                int h = map.get(loc);
                if (!ans.isEmpty() && ans.get(ans.size() - 1).get(1) == h) continue;
                ans.add(Arrays.asList(loc, h));
            }
            
            return ans;
        }
    }
}
