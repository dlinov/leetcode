package io.github.dlinov.leetcode;

import java.util.Arrays;

/* Reference solution:
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}
*/

public class Task001TwoSumJava {
    public static int main(String[] args) {
        final Solution solver = new Solution();
        final int nums[] = {2, 7, 11, 15};
        final int target = 9;
        final int s[] = solver.twoSum(nums, target);
        System.out.println(s[0]);
        System.out.println(s[1]);
        return 0;
    }
}
    
class Solution {
    public int[] twoSum(int[] nums, int target) {
        final int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        final int result[] = new int[2];
        int i = 0;
        int j = numsCopy.length - 1;
        while (i < j) {
            int a = numsCopy[i];
            int b = numsCopy[j];
            int sum = a + b;
            if (sum < target) {
                ++i;
            } else if (sum > target) {
                --j;
            } else {
                break;
            }
        }
        boolean isFirstSet = false;
        final int a = numsCopy[i];
        final int b = numsCopy[j];
        for (int k = 0; k < nums.length; ++k) {
            if (nums[k] == a && !isFirstSet) {
                isFirstSet = true;
                result[0] = k;
            }
            if (nums[k] == b) {
                result[1] = k;
            }
        }
        return result;
    }
}
