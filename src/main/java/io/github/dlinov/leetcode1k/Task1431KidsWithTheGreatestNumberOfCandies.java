package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1431KidsWithTheGreatestNumberOfCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            final List<Boolean> result = new ArrayList<>(candies.length);
            int max = candies[0];
            for (int i = 1; i < candies.length; ++i) {
                if (candies[i] > max) max = candies[i];
            }
            for (int i = 0; i < candies.length; ++i) {
                result.add(candies[i] + extraCandies >= max);
            }
            return result;
        }
    }
}