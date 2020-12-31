package io.github.dlinov.leetcode;

public class Task084LargestRectangleInHistogram {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            return largestArea(heights, 0, heights.length - 1);
        }
        
        private int largestArea(int[] heights, int low, int high){
            if (low > high) return 0;
            if (low == high) return heights[low];
            int minIndex = findIndexOfMinimumValue(heights, low, high);
            int areaWithMin = (high - low + 1) * heights[minIndex];
            int areaLeft = largestArea(heights, low, minIndex - 1);
            int areaRight = largestArea(heights, minIndex + 1, high);
    
            return Math.max(areaWithMin, Math.max(areaLeft, areaRight));
        }
        
        private int findIndexOfMinimumValue(int[] heights, int low, int high){
            int minIndex = low;
            for (int i = low; i <= high; i++)
                if (heights[i] < heights[minIndex])
                    minIndex = i;
            return minIndex;
        }
    }
}
