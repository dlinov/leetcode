package io.github.dlinov.leetcode;

public class Task080RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;
        int index = 1;
        boolean repeat = false;
        for (int i = 1, prev = nums[0]; i < n; prev = nums[i], i++) {
            if (nums[i] != prev){
                nums[index++] = nums[i];
                repeat = false;
            } else if (!repeat) {
                nums[index++] = nums[i];
                repeat = true;
            }
        }
        return index;
    }
}
