package io.github.dlinov.leetcode;

import java.util.*;

class Task047PermutationsII {
    class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            boolean isReversed = false;
            List<List<Integer>> results = new ArrayList<>();
            while (!isReversed) {
                List<Integer> toAdd = new ArrayList<>(nums.length);
                for (int i = 0; i< nums.length; ++i) {
                    toAdd.add(nums[i]);
                }
                results.add(toAdd);
                boolean readyForNext = false;
                for (int i = nums.length - 2; i >= 0; --i) {
                    if (nums[i] < nums[i + 1]) {
                        for (int j = nums.length - 1; j > i; --j) {
                            if (nums[j] > nums[i]) {
                                // swap nums[j] > nums[i]
                                int tmp = nums[j];
                                nums[j] = nums[i];
                                nums[i] = tmp;
                                // reverse suffix
                                i++;
                                for (int k = nums.length - 1; k > i; --k, ++i) {
                                    tmp = nums[k];
                                    nums[k] = nums[i];
                                    nums[i] = tmp;
                                }
                                readyForNext = true;
                                break;
                            }
                        }
                    }
                    // break if done once
                    if (readyForNext) {
                        break;
                    }
                }
                isReversed = !readyForNext;
            }
            return results;
        }
    }
}
