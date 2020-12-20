package io.github.dlinov.leetcode;

public class Task832FlippingAnImage {
    class Solution {
        public int[][] flipAndInvertImage(int[][] A) {
            final int rowSize = A[0].length;
            for (int i = 0; i < A.length; ++i) {
                for (int j = 0; j < (rowSize + 1) / 2; ++j) {
                    final int tmp = A[i][j] ^ 1;
                    A[i][j] = A[i][rowSize - 1 - j] ^ 1;
                    A[i][rowSize - 1 - j] = tmp;
                }
            }
            return A;
        }
    }
}
