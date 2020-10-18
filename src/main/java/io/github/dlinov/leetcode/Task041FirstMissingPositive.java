package io.github.dlinov.leetcode;

public class Task041FirstMissingPositive {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int left = 0;
            for(int right = 0; right < nums.length; right++){
                if(nums[right] > 0){
                    nums[left++] = nums[right];
                }
            }
            for(int i = 0; i < left; i++){
                int val = Math.abs(nums[i]);
                if(val > 0 && val <= left){
                    if(nums[val - 1] > 0)
                        nums[val - 1] = -nums[val - 1];
                }
            }
            for(int i = 0; i < left; i++){
                if(nums[i] > 0) return i + 1;
            }
            return left + 1;
        }
    }
}
