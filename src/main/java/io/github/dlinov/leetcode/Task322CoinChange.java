package io.github.dlinov.leetcode;

import java.util.*;

public class Task322CoinChange {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] cache = new int[amount];
            return internalCoinChange(coins, cache, amount);
        }

        private int internalCoinChange(int[] coins, int[] cache, int rem) {
            if (rem < 0) {
                return -1;
            }
            if (rem == 0) {
                return 0;
            }
            if (cache[rem - 1] != 0) {
                return cache[rem - 1];
            }
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                int res = internalCoinChange(coins, cache, rem - coin);
                if (res >= 0 && res < min) {
                    min = res + 1;
                }
            }
            cache[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
            return cache[rem - 1];
        }
    }
}
