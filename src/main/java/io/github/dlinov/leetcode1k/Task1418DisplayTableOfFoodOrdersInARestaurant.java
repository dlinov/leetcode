package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1418DisplayTableOfFoodOrdersInARestaurant {
    class Solution {
        public List<List<String>> displayTable(List<List<String>> orders) {
            TreeMap<Integer, TreeMap<String, Integer>> summaries = new TreeMap<>();
            TreeSet<String> foodItems = new TreeSet<>();
            for (List<String> orderItem : orders) {
                final int table = Integer.parseInt(orderItem.get(1));
                final String foodItem = orderItem.get(2);
                foodItems.add(foodItem);
                TreeMap<String, Integer> tableOrders = summaries.computeIfAbsent(table, k -> new TreeMap<String, Integer>());
                tableOrders.compute(foodItem, (k, v) -> v == null ? 1 : v + 1);
            }
            List<List<String>> result = new ArrayList<>();
            List<String> header = new ArrayList<>();
            header.add("Table");
            header.addAll(foodItems);
            result.add(header);
            for (Integer tableNumber : summaries.navigableKeySet()) {
                TreeMap<String, Integer> tableOrder = summaries.get(tableNumber);
                final List<String> row = new ArrayList<>();
                row.add(tableNumber.toString());
                for (String foodKey : foodItems) {
                    row.add(tableOrder.getOrDefault(foodKey, 0).toString());
                }
                result.add(row);
            }
            return result;
        }
    }
}