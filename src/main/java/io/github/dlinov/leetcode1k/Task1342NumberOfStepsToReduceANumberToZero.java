package io.github.dlinov.leetcode1k;

public class Task1342NumberOfStepsToReduceANumberToZero {
    class Solution {
        public int numberOfSteps (int num) {
            int res = 0;
            while (num != 0) {
                if (num % 2 == 0) num /= 2;
                else --num;
                ++res;
            }
            return res;
        }
    }
}
