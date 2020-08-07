package io.github.dlinov.leetcode1k;

public class Task1475FinalPricesWithASpecialDiscountInAShop {
    class Solution {
        public int[] finalPrices(int[] prices) {
            final int[] result = new int[prices.length];
            for (int i = 0; i < prices.length; ++i) {
                result[i] = prices[i];
                for (int j = i + 1; j < prices.length; ++j) {
                    if (prices[j] <= prices[i]) {
                        result[i] -= prices[j];
                        break;
                    }
                }
            }
            return result;
        }
    }
}