package io.github.dlinov.leetcode;

public class Task134GasStation {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int tank = 0, start = 0, min = 0;
            for (int i = 0; i < gas.length; ++i) {
                tank += gas[i] - cost[i];
                if (tank < min) {
                    min = tank;
                    start = i + 1;
                }
            }
            if (tank < 0) return -1;
            return start % gas.length;
        }
    }
}
