package io.github.dlinov.leetcode;

import java.util.*;

public class Task949LargestTimeForGivenDigits {
    class Solution {
        public String largestTimeFromDigits(int[] A) {
            Arrays.sort(A);
            for (int i = A.length - 1; i >= 0; --i) {
                if (A[i] < 3) {
                    final Set<Integer> used = new HashSet<>(4);
                    used.add(i);
                    final String result = solve(A, used, A[i]);
                    if (!result.isEmpty()) {
                        return result;
                    }
                }
            }
            return "";
        }

        private String solve(int[] A, Set<Integer> used, int first) {
            final StringBuilder s = new StringBuilder(5);
            s.append(first);
            int maxH2 = first == 2 ? 3 : 9;
            int tmp = -1;
            int tmpI = -1;
            for (int i = 0; i < A.length; ++i) {
                if (!used.contains(i) && A[i] <= maxH2 && A[i] > tmp) {
                    tmp = A[i];
                    tmpI = i;
                }
            }
            if (tmpI < -0) return "";
            used.add(tmpI);
            s.append(tmp);
            s.append(':');

            tmp = -1;
            tmpI = -1;
            for (int i = 0; i < A.length; ++i) {
                if (!used.contains(i) && A[i] < 6 && A[i] > tmp) {
                    tmp = A[i];
                    tmpI = i;
                }
            }
            if (tmpI < -0) return "";
            used.add(tmpI);
            s.append(tmp);

            for (int i = 0; i < A.length; ++i) {
                if (!used.contains(i)) {
                    s.append(A[i]);
                    break;
                }
            }

            return s.toString();
        }
    }
}
