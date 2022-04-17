package io.github.dlinov.leetcode;

import java.util.*;

class Task208ImplementTriePrefixTree {
    class Trie {
        private Map<Character, Trie> tries;
        private boolean endsHere;

        public Trie() {
            tries = new HashMap<>();
            endsHere = false;
        }
        
        public void insert(String word) {
            insert(word, 0);
        }
        
        public boolean search(String word) {
            return search(word, 0);
        }
        
        public boolean startsWith(String prefix) {
            return startsWith(prefix, 0);
        }

        private void insert(String word, int fromIndex) {
            // TODO: check empty string?
            final int wordLength = word.length();
            if (wordLength == fromIndex) {
                endsHere = true;
                return;
            }
            final Character currChar = word.charAt(fromIndex);
            final Trie nextTrie = tries.computeIfAbsent(currChar, ch -> new Trie());
            nextTrie.insert(word, fromIndex + 1);
        }

        private boolean search(String word, int fromIndex) {
            final int wordLength = word.length();
            if (wordLength == fromIndex) {
                return endsHere;
            }
            final Character currChar = word.charAt(fromIndex);
            final Trie nextTrie = tries.get(currChar);
            return nextTrie == null
                ? false
                : nextTrie.search(word, fromIndex + 1);
        }

        private boolean startsWith(String prefix, int fromIndex) {
            final int wordLength = prefix.length();
            if (wordLength == fromIndex) {
                return true;
            }
            final Character currChar = prefix.charAt(fromIndex);
            final Trie nextTrie = tries.get(currChar);
            return nextTrie == null
                ? false
                : nextTrie.startsWith(prefix, fromIndex + 1);
        }
    }
}
