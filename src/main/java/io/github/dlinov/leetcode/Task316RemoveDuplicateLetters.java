package io.github.dlinov.leetcode;

import java.util.*;

public class Task316RemoveDuplicateLetters {
    class Solution {
        public String removeDuplicateLetters(String s) {
            final int last_index[] = new int[26];
            final boolean visited[] = new boolean[26];
            for(int i = 0; i < s.length(); ++i){
                last_index[s.charAt(i) - 'a'] = i;
            }
            final Stack<Character> stec = new Stack<>();
            for (int i = 0; i < s.length(); ++i) {
                if (visited[s.charAt(i) - 'a']) continue;
                while (!stec.isEmpty() && stec.peek() > s.charAt(i) && i < last_index[stec.peek() - 'a']) {
                    Character ch = stec.pop();
                    visited[ch - 'a'] = false;
                }
                stec.push(s.charAt(i));
                visited[s.charAt(i) - 'a'] = true;
            }
            final StringBuffer sb = new StringBuffer();
            while (!stec.isEmpty()) {
                sb.append(stec.pop());
            }
            return sb.reverse().toString();
        }
    }
}
