package io.github.dlinov.leetcode;

import java.util.Arrays;

public class Task075SortColors {
    class Solution {
        public void sortColors(int[] nums) {
            final int[] counts = new int[3];
            for (int i = 0; i < nums.length; ++i) {
                counts[nums[i]]++;
            }
            Arrays.fill(nums, 0, counts[0], 0);
            Arrays.fill(nums, counts[0], counts[0] + counts[1], 1);
            Arrays.fill(nums, counts[0] + counts[1], nums.length, 2);
        }
    }
}