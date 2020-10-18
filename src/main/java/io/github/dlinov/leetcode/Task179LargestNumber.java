package io.github.dlinov.leetcode;

import java.util.*;

public class Task179LargestNumber {
    class Solution {
        public String largestNumber(int[] nums) {
            final String[] sArr = new String[nums.length];
            int resLength = 0;
            for (int i = 0; i < nums.length; ++i) {
                final String s = Integer.toString(nums[i]);
                resLength += s.length();
                sArr[i] = s;
            }
            Arrays.sort(sArr, (a, b) -> (b + a).compareTo(a + b));
            final StringBuilder sb = new StringBuilder(resLength);
            for (int i = 0; i < sArr.length; ) {
                sb.append(sArr[i++]);
            }
            return sb.charAt(0) == '0' ? "0" : sb.toString();
        }
    }
}
