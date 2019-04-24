package io.github.dlinov.leetcode;

import java.util.*;

class Task039CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> results = new ArrayList<>();
            DFS(candidates, 0, target, new ArrayList<>(), results);
            return results;
        }

        private void DFS(int[] candidates, int level, int left, List<Integer> curr, List<List<Integer>> results) {
            if (level == candidates.length) {
                if (left == 0) {
                    results.add(new ArrayList<>(curr));
                }
                return;
            }
            for (int i = 0; candidates[level] * i <= left; ++i) {
                for (int j = 0; j < i; ++j) {
                    curr.add(candidates[level]);
                }
                DFS(candidates, level + 1, left - candidates[level] * i, curr, results);
                for (int j = 0; j < i; ++j) {
                    curr.remove(curr.size() - 1);
                }
            }
        }
    }
}
