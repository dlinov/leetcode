package io.github.dlinov.leetcode;

import java.util.*;

public class Task211AddAndSearchWordDataStructureDesign {
    class WordDictionary {

        class TrieNode {
            Map<Character, TrieNode> children;
            boolean endOfWord;
            
            public TrieNode() {
                children = new HashMap<>();
                endOfWord = false;
            }
        }
        
        private TrieNode root;

        /** Initialize your data structure here. */
        public WordDictionary() {
            root = new TrieNode();
        }
        
        /** Adds a word into the data structure. */
        public void addWord(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); ++i) {
                final char ch = word.charAt(i);
                node = node.children.computeIfAbsent(ch, x -> new TrieNode());
            }
            node.endOfWord = true;
        }
        
        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            return searchSingle(root, word, 0);
        }

        private boolean searchSingle(TrieNode node, String word, int index) {
            if (word.length() == index) return node.endOfWord;
            else {
                final char ch = word.charAt(index);
                if (ch == '.') {
                    return node.children.values().stream().anyMatch(n -> searchSingle(n, word, index + 1));
                } else {
                    final TrieNode child = node.children.get(ch);
                    if (child == null) return false;
                    else return searchSingle(child, word, index + 1);
                }
            }
        }
    }
    
    /**
     * Your WordDictionary object will be instantiated and called as such:
     * WordDictionary obj = new WordDictionary();
     * obj.addWord(word);
     * boolean param_2 = obj.search(word);
     */
}