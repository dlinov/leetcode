package io.github.dlinov.leetcode;

import java.util.*;

class Task040CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<List<Integer>> results = new ArrayList<>();
            DFS(candidates, 0, target, new ArrayList<>(), results);
            return results;
        }

        private void DFS(int[] nums, int start, int left, List<Integer> curr, List<List<Integer>> results) {
            if (left == 0) {
                results.add(new ArrayList<>(curr));
                return;
            }
            for (int i = start; i < nums.length; ++i) {
                if (left < nums[i]) {
                    break;
                }
                curr.add(nums[i]);
                DFS(nums, i + 1, left - nums[i], curr, results);
                curr.remove(curr.size() - 1);
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    ++i;
                }
            }
        }
    }
}
