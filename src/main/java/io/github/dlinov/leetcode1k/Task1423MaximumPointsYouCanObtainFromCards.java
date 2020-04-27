package io.github.dlinov.leetcode1k;

public class Task1423MaximumPointsYouCanObtainFromCards {
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            final int n = cardPoints.length;
            int result = 0;
            if (k == n) {
                for (int i = 0; i < n; ) {
                    result += cardPoints[i++];
                }
            } else {
                final int[] memoL = new int[k + 1];
                memoL[0] = 0;
                for (int i = 1; i <= k; ++i) {
                    memoL[i] = memoL[i - 1] + cardPoints[i - 1];
                }
                final int[] memoR = new int[k + 1];
                memoR[0] = 0;
                for (int i = 1; i <= k; ++i) {
                    memoR[i] = memoR[i - 1] + cardPoints[n - i];
                }
                result = 0;
                for (int i = 0; i <= k; ++i) {
                    result = Math.max(memoL[i] + memoR[k - i], result);
                }
            }
            return result;
        }
    }
}