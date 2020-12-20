package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1636SortArrayByIncreasingFrequency {
    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> freqs = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                freqs.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
            }
            TreeMap<Integer, ArrayList<Integer>> tm = new TreeMap<>();
            for (Map.Entry<Integer, Integer> entry : freqs.entrySet()) {
                ArrayList<Integer> fs = tm.compute(entry.getValue(), (k, v) -> v == null ? new ArrayList<Integer>() : v);
                fs.add(entry.getKey());
            }
            int[] result = new int[nums.length];
            int i = 0;
            for (Map.Entry<Integer, ArrayList<Integer>> entry : tm.entrySet()) {
                int n = entry.getKey();
                ArrayList<Integer> vals = entry.getValue();
                Collections.sort(vals, Collections.reverseOrder());
                for (Integer v : vals) {
                    for (int j = 0; j < n; ++j) {
                        result[i++] = v;
                    }
                }
            }
            return result;
        }
    }
}
