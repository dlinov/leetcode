package io.github.dlinov.leetcode.unlisted;

import java.util.List;

public class LeftmostColumnWithAtLeastAOne {

// This is the BinaryMatrix's API interface.
// You should not implement it, or speculate about its implementation
interface BinaryMatrix {
    public int get(int x, int y);
    public List<Integer> dimensions();
};

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dims = binaryMatrix.dimensions();
        final int n = dims.get(0); // rows number, e.g. 3
        final int m = dims.get(1); // columns number, e.g. 4
        int x = 0; // row index
        int y = m - 1; // column index
        while (x < n && y >= 0) {
            int cell = binaryMatrix.get(x, y);
            if (cell == 0) ++x; else --y;
        }
        return x == n
            ? (y + 1 == m ? - 1 : y + 1)
            : 0;
    }
}
}