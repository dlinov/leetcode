package io.github.dlinov.leetcode;

import java.util.Arrays;

public class Task881BoatsToSavePeople {
    class Solution {
        public int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int i = 0, j = people.length - 1;
            int result = 0;
            while (i <= j) {
                result++;
                if (people[i] + people[j] <= limit)
                    i++;
                j--;
            }
            return result;
        }
    }
}
