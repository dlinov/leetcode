package io.github.dlinov.leetcode;

import java.util.*;

class Task038CountAndSay {
    class Solution {
        public String countAndSay(int n) {
            String result = "1";
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < n; ++i) {
                sb.setLength(0);
                char curr = result.charAt(0);
                int currCount = 1;
                for (int j = 1; j < result.length(); ++j) {
                    if (result.charAt(j) == curr) {
                        ++currCount;
                    } else {
                        sb.append(currCount);
                        sb.append(curr);
                        currCount = 1;
                        curr = result.charAt(j);
                    }
                }
                sb.append(currCount);
                sb.append(curr);
                result = sb.toString();
            }
            return result;
        }
    }
}
