package io.github.dlinov.leetcode;

public class Task136SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            int answer = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                answer = answer ^ nums[i];
            }
            return answer;
        }
    }
}