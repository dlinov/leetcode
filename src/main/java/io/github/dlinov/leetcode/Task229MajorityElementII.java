package io.github.dlinov.leetcode;

import java.util.*;

public class Task229MajorityElementII {
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            final Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; ++i) {
                map.compute(nums[i], (k, v) -> v == null ? 1 : v + 1);
            }
            final int atLeastMaj = nums.length / 3 + 1;
            final List<Integer> result = new ArrayList<>();
            for (Map.Entry<Integer, Integer> kv : map.entrySet()) {
                if (kv.getValue() >= atLeastMaj) {
                    result.add(kv.getKey());
                }
            }
            return result;
        }
    }
}
