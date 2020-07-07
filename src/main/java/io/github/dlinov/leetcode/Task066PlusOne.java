package io.github.dlinov.leetcode;

public class Task066PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            int add = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                if (add == 0) break;
                final int sum = digits[i] + add;
                digits[i] = sum % 10;
                add = sum / 10;
            }
            if (add == 0) {
                return digits;
            } else {
                int[] result = new int[digits.length + 1];
                System.arraycopy(digits, 0, result, 1, digits.length);
                result[0] = add;
                return result;
            }
        }
    }
}