package io.github.dlinov.leetcode;

import java.util.*;

class Task018FourSum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            final List<List<Integer>> results = new ArrayList<>(512);
            final Set<String> hashes = new HashSet<String>();
            final int n = nums.length;
            Arrays.sort(nums);
            for (int i = 0; i < n; ++i) {
                final int n1 = nums[i];
                final String n1s = String.valueOf(n1);
                for (int j = i + 1; j < n; ++j) {
                    final int n2 = nums[j];
                    final String n2s = String.valueOf(n2);
                    final int halfSum = n1 + n2;
                    int p1 = 0;
                    int p2 = n - 1;
                    while (p1 < i && p2 > j/* && p1 < p2*/) {
                        final int n3 = nums[p1];
                        final int n4 = nums[p2];
                        final int sum = halfSum + n3 + n4;
                        if (sum > target) {
                            --p2;
                        } else if (sum < target) {
                            ++p1;
                        } else {
                            final String hash = n1s + "_" + n2s + "_" + String.valueOf(n3);
                            if (!hashes.contains(hash)) {
                                hashes.add(hash);
                                results.add(Arrays.asList(n1, n2, n3, n4));
                            }
                            ++p1;
                            --p2;
                        }
                    }
                }
            }
            return results;
        }
    }
}