package io.github.dlinov.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Task054SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
        final List<Integer> result = new ArrayList<>();
        final int R = matrix.length;
        if (R == 0) return result;
        final int C = matrix[0].length;
        
        int startRow = 0, endRow = R - 1;
        int startCol = 0, endCol = C - 1;
        int direction = 90;
        while (startRow <= endRow && startCol <= endCol) {
            switch (direction) {
                case 90: // to the right
                    for (int j = startCol; j <= endCol; ++j) {
                        result.add(matrix[startRow][j]);
                    }
                    ++startRow;
                    break;
                case 180: // to the bottom
                    for (int i = startRow; i <= endRow; ++i) {
                        result.add(matrix[i][endCol]);
                    }
                    --endCol;
                    break;
                case 270: // to the left
                    for (int j = endCol; j >= startCol; --j) {
                        result.add(matrix[endRow][j]);
                    }
                    --endRow;
                    break;
                case 0: // to the top
                    for (int i = endRow; i >= startRow; --i) {
                        result.add(matrix[i][startCol]);
                    }
                    ++startCol;
                    break;
                default:
                    throw new RuntimeException("direction");
            }
            direction = (direction + 90) % 360;
        }
        return result;
        }
    }
}
