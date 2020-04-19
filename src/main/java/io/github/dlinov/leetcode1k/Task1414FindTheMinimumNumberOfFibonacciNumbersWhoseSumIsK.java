package io.github.dlinov.leetcode1k;

import java.util.Arrays;

public class Task1414FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK {
    class Solution {
        public int findMinFibonacciNumbers(int k) {
            int[] fibs = new int[45]; // the 45th Fibonacci is larger than 1*10^9 - constraint for k from task
            fibs[0] = 1;
            fibs[1] = 1;
            for (int i = 2; i < fibs.length; ++i) {
                fibs[i] = fibs[i - 1] + fibs[i - 2];
            }
            int kRem = k;
            int result = 0;
            while (kRem > 0) {
                int i = Arrays.binarySearch(fibs, kRem);
                // when exact number is not found, negative index of insertion is returned. -2 because of there are two 1's in the beginning
                if (i < 0) i = -i - 2;
                kRem -= fibs[i];
                result += 1;
            }
            return result;
        }
    }
}