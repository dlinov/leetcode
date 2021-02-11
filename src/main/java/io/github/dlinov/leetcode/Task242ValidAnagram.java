package io.github.dlinov.leetcode;

public class Task242ValidAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            final int sLength = s.length();
            final int tLength = t.length();
            if (sLength != tLength) return false;
            int[] letters = new int[26];
            for (int i = 0; i < sLength; ++i) {
                letters[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < tLength; ++i) {
                letters[t.charAt(i) - 'a']--;
            }
            for (int i = 0; i < letters.length; ++i) {
                if (letters[i] != 0) return false;
            }
            return true;
        }
    }
}
