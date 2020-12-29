package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1457PseudoPalindromicPathsInABinaryTree {
    class Solution {
        public int pseudoPalindromicPaths (TreeNode root) {
            int count = 0, path = 0;
            
            Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque<>();
            stack.push(new Pair<TreeNode, Integer>(root, 0));
            while (!stack.isEmpty()) {
                Pair<TreeNode, Integer> p = stack.pop();
                TreeNode node = p.getKey();
                path = p.getValue();
    
                if (node != null) {
                    // compute occurences of each digit 
                    // in the corresponding register
                    path = path ^ (1 << node.val);
                    // if it's a leaf check if the path is pseudo-palindromic
                    if (node.left == null && node.right == null) {
                        // check if at most one digit has an odd frequency
                        if ((path & (path - 1)) == 0) {
                            ++count;
                        }
                    } else {
                        stack.push(new Pair<TreeNode, Integer>(node.right, path));
                        stack.push(new Pair<TreeNode, Integer>(node.left, path));
                    }
                }
            }
            return count;
        }
    }

    /**
     * Definition for a binary tree node.
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Pair<K, V> {
        private final K k;
        private final V v;
        public Pair(K key, V val) {
            k = key;
            v = val;
        }

        public K getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }
    }
}
