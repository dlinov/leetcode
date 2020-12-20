package io.github.dlinov.leetcode;

import java.util.*;

public class Task310MinimumHeightTrees {
    class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            List<Integer> leaves = new ArrayList<>();
            if (n == 0) return leaves;
            else if (n == 1) { leaves.add(0); return leaves; }
            Map<Integer, List<Integer>> lists = new HashMap<>(n);
            for (int i = 0; i < n; i++) lists.put(i, new ArrayList<>());
            for (int[] e : edges) {
                int v1 = e[0], v2 = e[1];
                lists.get(v1).add(v2);
                lists.get(v2).add(v1);
            }
            for (int i = 0; i < n; i++) if (lists.get(i).size() == 1) leaves.add(i);
            int count = n;
            while (count > 2) {
                count -= leaves.size();
                List<Integer> newLeaves = new ArrayList<>();
                for (Integer leaf : leaves) { // for all current leaves
                    for (Integer toRemove : lists.get(leaf)) { // for all current leaves' subtree
                        lists.get(toRemove).remove(Integer.valueOf(leaf)); // remove leaf
                        if (lists.get(toRemove).size() == 1)
                            newLeaves.add(toRemove);
                    }
                }
                leaves = newLeaves;
            }
            return leaves;
        }
    }
}
