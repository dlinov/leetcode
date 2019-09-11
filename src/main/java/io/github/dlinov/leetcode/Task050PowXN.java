package io.github.dlinov.leetcode;

class Task050PowXN {
    class Solution {
        public double myPow(double x, int n) {
            if (n > 0) {
                return myMultPow(x, n);
            } else if (n < 0) {
                return myDivPow(x, n);
            } else {
                return 1;
            }
        }

        private double myMultPow(double x, int n) {
            if (n == 1) {
                return x;
            } else {
                double result = myMultPow(x, n / 2);
                result *= result;
                if (n % 2 == 1) {
                    result *= x;
                }
                return result;
            }
        }

        private double myDivPow(double x, int n) {
            if (n == -1) {
                return 1 / x;
            } else {
                double result = myDivPow(x, n / 2);
                result *= result;
                if (n % 2 == -1) {
                    result /= x;
                }
                return result;
            }
        }
    }
}
