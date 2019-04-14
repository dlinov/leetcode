package io.github.dlinov.leetcode;

import java.util.*;

class Task028ImplementStrStr {
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.isEmpty()) {
                return 0;
            }
            int result = -1;
            final int hLength = haystack.length();
            final int nLength = needle.length();
            for (int i = 0; i <= hLength - nLength; ++i) {
                boolean flag = true;
                for (int j = 0; j < nLength; ++j) {
                    flag = flag && haystack.charAt(i + j) == needle.charAt(j);
                    if (!flag) {
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
            return result;
        }
    }
}