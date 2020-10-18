package io.github.dlinov.leetcode;

public class Task074SearchA2DMatrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix.length == 0 || matrix[0].length == 0) return false;
            final int N = matrix.length * matrix[0].length;
            return binSearch(matrix, target, 0, N - 1);
        }
        
        private boolean binSearch(int[][] matrix, int target, int left, int right) {
            final int mid = left + (right - left) / 2;
            final int y = mid / matrix[0].length;
            final int x = mid % matrix[0].length;
            if (left == right) return matrix[y][x] == target;
            if (target > matrix[y][x]) return binSearch(matrix, target, mid + 1, right);
            return binSearch(matrix, target, left, mid);
        }
    }
}
