package io.github.dlinov.leetcode;

class Task012IntegerToRoman {
    class Solution {
        public String intToRoman(int num) {
            int n = num;
            final StringBuilder sb = new StringBuilder(20);
            int d1 = n / 1000;
            n -= d1 * 1000;
            while (d1-- > 0) {
                sb.append("M");
            }

            int d2 = n / 100;
            n -= d2 * 100;
            if (d2 == 9) {
                sb.append("CM");
            } else if (d2 == 4) {
                sb.append("CD");
            } else {
                if (d2 >= 5) {
                    sb.append("D");
                    d2 -= 5;
                }
                while (d2-- > 0) {
                    sb.append("C");
                }
            }
            
            int d3 = n / 10;
            n -= d3 * 10;
            if (d3 == 9) {
                sb.append("XC");
            } else if (d3 == 4) {
                sb.append("XL");
            } else {
                if (d3 >= 5) {
                    sb.append("L");
                    d3 -= 5;
                }
                while (d3-- > 0) {
                    sb.append("X");
                }
            }

            int d4 = n;
            if (d4 == 9) {
                sb.append("IX");
            } else if (d4 == 4) {
                sb.append("IV");
            } else {
                if (d4 >= 5) {
                    sb.append("V");
                    d4 -= 5;
                }
                while (d4-- > 0) {
                    sb.append("I");
                }
            }
            return sb.toString();
        }
    }
}