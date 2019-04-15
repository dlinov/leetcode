package io.github.dlinov.leetcode;

import java.util.*;

class Task013RomanToInteger {
    class Solution {
        public int romanToInt(String s) {
            int result = 0;
            int lastIndex = s.length() - 1;
            for (int i = 0; i <= lastIndex; ++i) {
                final char digit1 = s.charAt(i);
                switch (digit1) {
                    case 'M':
                        result += 1000;
                        break;
                    case 'D':
                        result += 500;
                        break;
                    case 'C':
                        if (i < lastIndex) {
                            switch (s.charAt(i + 1)) {
                                case 'M':
                                    result += 900;
                                    ++i;
                                    break;
                                case 'D':
                                    result += 400;
                                    ++i;
                                    break;
                                default:
                                    result += 100;
                                    break;
                            }
                        } else {
                            result += 100;
                        }
                        break;
                    case 'L':
                        result += 50;
                        break;
                    case 'X':
                        if (i < lastIndex) {
                            switch (s.charAt(i + 1)) {
                                case 'C':
                                    result += 90;
                                    ++i;
                                    break;
                                case 'L':
                                    result += 40;
                                    ++i;
                                    break;
                                default:
                                    result += 10;
                                    break;
                            }
                        } else {
                            result += 10;
                        }
                        break;
                    case 'V':
                        result += 5;
                        break;
                    case 'I':
                        if (i < lastIndex) {
                            switch (s.charAt(i + 1)) {
                                case 'X':
                                    result += 9;
                                    ++i;
                                    break;
                                case 'V':
                                    result += 4;
                                    ++i;
                                    break;
                                default:
                                    result += 1;
                                    break;
                            }
                        } else {
                            result += 1;
                        }
                        break;
                    default:
                        break;
                }
            }
            return result;
        }
    }
}