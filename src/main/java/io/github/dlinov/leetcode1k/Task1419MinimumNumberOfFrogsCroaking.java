package io.github.dlinov.leetcode1k;

public class Task1419MinimumNumberOfFrogsCroaking {
    class Solution {
        public int minNumberOfFrogs(String croakOfFrogs) {
            int c = 0;
            int r = 0;
            int o = 0;
            int a = 0;
            int k = 1;
            int inProgress = 0;
            for (int i = 0; i < croakOfFrogs.length(); ++i) {
                final char ch = croakOfFrogs.charAt(i);
                switch (ch) {
                    case 'c':
                        ++c;
                        ++inProgress;
                        break;
                    case 'r':
                        if (c < 1) return -1;
                        --c;
                        ++r;
                        break;
                    case 'o':
                        if (r < 1) return -1;
                        --r;
                        ++o;
                        break;
                    case 'a':
                        if (o < 1) return -1;
                        --o;
                        ++a;
                        break;
                    case 'k':
                        if (a < 1) return -1;
                        --a;
                        k = Math.max(inProgress, k);
                        --inProgress;
                        break;
                    default:
                        return -1;
                }
            }
            return inProgress == 0 ? k : -1;
        }
    }
}