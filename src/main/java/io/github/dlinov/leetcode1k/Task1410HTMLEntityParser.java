package io.github.dlinov.leetcode1k;

import java.util.HashMap;
import java.util.Map;

public class Task1410HTMLEntityParser {
    public class Solution {
        public String entityParser(String text) {
            final int textSize = text.length();
            final StringBuilder sb = new StringBuilder(textSize);
            final Map<String, Character> special = new HashMap<>();
            special.put("&quot;", '\"');
            special.put("&apos;", '\'');
            special.put("&amp;", '&');
            special.put("&gt;", '>');
            special.put("&lt;", '<');
            special.put("&frasl;", '/');
            for (int i = 0; i < textSize;) {
                int finish = textSize;
                String key = "";
                Character value = null;
                for (String k : special.keySet()) {
                    int start = text.indexOf(k, i);
                    if (start > -1 && start < finish) {
                        finish = start;
                        key = k;
                        value = special.get(k);
                    }
                }
                sb.append(text.substring(i, finish));
                if (value != null) {
                    sb.append(value);
                }
                i = finish + key.length();
            }
            return sb.toString();
        }
    }
}