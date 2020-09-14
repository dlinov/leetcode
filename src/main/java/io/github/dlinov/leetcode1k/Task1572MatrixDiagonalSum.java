package io.github.dlinov.leetcode1k;

// Matrix Diagonal Sum
class SolutionMDS {
    public int diagonalSum(int[][] mat) {
        final int a = mat.length;
        int sum = 0;
        for (int i = 0; i < a; ++i) {
            sum += mat[i][i];
        }
        for (int i = 0; i < a; ++i) {
            sum += mat[a - i - 1][i];
        }
        if (a % 2 == 1) sum -= mat[a/2][a/2];
        return sum;
    }
}