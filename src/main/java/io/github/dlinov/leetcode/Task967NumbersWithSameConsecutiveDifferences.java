package io.github.dlinov.leetcode;

import java.util.*;

public class Task967NumbersWithSameConsecutiveDifferences {
    class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        if (n == 1) return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        final List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            findAll(n - 1, k, i, list);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    private void findAll(int n, int k, int num, List<Integer> list) {
        if (n == 0) {
            list.add(num);
            return;
        }
        final int last = num % 10;
        if (k != 0 && last - k >= 0) {
            findAll(n - 1, k, num * 10 + (last - k), list);
        }
        if (last + k <= 9) {
            findAll(n - 1, k, num * 10 + (last + k), list);
        }
    }
    }
}