package io.github.dlinov.leetcode;

public class Task122BestTimeToBuyAndSellStockII {
    class Solution {
        public int maxProfit(int[] prices) {
            final int size = prices.length;
            int profit = 0;
            for (int i = 1; i < size; ++i) {
                if (prices[i] > prices[i - 1]) {
                    profit += prices[i] - prices[i - 1];
                }
            }
            return profit;
        }
    }
}
