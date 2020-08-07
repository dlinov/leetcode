package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1460MakeTwoArraysEqualByReversingSubarrays {
    class Solution {
        public boolean canBeEqual(int[] target, int[] arr) {
            final Map<Integer, Integer> stat = new HashMap<>();
            for (int i = 0; i < target.length; ++i) {
                stat.compute(target[i], (k, v) -> (v == null) ? 1 : v + 1);
            }
            for (int i = 0; i < arr.length; ++i) {
                final Integer counter = stat.get(arr[i]);
                if (counter == null || counter < 1) {
                    return false;
                } else {
                    stat.put(arr[i], counter - 1);
                }
            }
            return true;
        }
    }
}