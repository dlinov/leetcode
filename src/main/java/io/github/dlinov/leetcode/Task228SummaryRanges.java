package io.github.dlinov.leetcode;

import java.util.*;

public class Task228SummaryRanges {
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            final List<String> result = new ArrayList<>();
            if (nums.length > 0) {
                int first = nums[0];
                int last = first;
                String lastAdded = "";
                for (int i = 1; i < nums.length; ++i) {
                    if (last + 1 < nums[i]) {
                        lastAdded = rangeToString(first, last);
                        result.add(lastAdded);
                        first = nums[i];
                    }
                    last = nums[i];
                }
                final String rangeToTest = rangeToString(first, last);
                if (lastAdded != rangeToTest) {
                    result.add(rangeToTest);
                }
            }
            return result;
        }

        private String rangeToString(int first, int last) {
            return first != last
                ? String.format("%d->%d", first, last)
                : Integer.toString(first);
        }
    }
}
