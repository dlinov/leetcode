package io.github.dlinov.leetcode1k;

public class Task1673FindTheMostCompetitiveSubsequence {
    class Solution {
        public int[] mostCompetitive(int[] nums, int k) {
            final int[] stack = new int[k];
            for (int i = 0, j = 0; i < nums.length; i++) {
                while (j > 0 && stack[j - 1] > nums[i] && j + nums.length - i > k) {
                    j--;
                }
                if (j < k) stack[j++] = nums[i];
            }
            return stack;
        }
    }
}
