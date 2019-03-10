package io.github.dlinov.leetcode;

import java.util.*;

public class Task007ReverseInteger {
    class Solution {
        public int reverse(int x) {
            int y = x;
            int acc = 0;
            while (y != 0) {
                int tmp = 10 * acc + y % 10;
                if ((tmp - y % 10) % 10 != 0) {
                    return 0;
                }
                acc = tmp;
                y /= 10;
            }
            return acc;
        }
    }
}