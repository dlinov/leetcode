package io.github.dlinov.leetcode;

import java.util.*;

public class Task121BestTimeToBuyAndSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int bestPrice = Integer.MAX_VALUE;
            for (int i = 0; i < prices.length; ++i) {
                int price = prices[i];
                if (price < bestPrice) {
                    bestPrice = price;
                }
                else if (maxProfit < price - bestPrice) {
                    maxProfit = price - bestPrice;
                }
            }
            return maxProfit;
        }
    }
}
