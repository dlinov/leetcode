package io.github.dlinov.leetcode1k;

import java.util.stream.*;

public class Task1022SumOfRootToLeafBinaryNumbers {
    class Solution {
        public int sumRootToLeaf(TreeNode root) {
            final Stream<String> allNumbers = readTree(root, "");
            return allNumbers.mapToInt(s -> Integer.parseInt(s, 2)).sum();
        }

        private Stream<String> readTree(TreeNode node, String acc) {
            if (node == null) return Stream.empty();
            else {
                final String curr = acc + Integer.toString(node.val);
                if (node.left == null && node.right == null) return Stream.of(curr);
                final Stream<String> left = readTree(node.left, curr);
                final Stream<String> right = readTree(node.right, curr);
                return Stream.concat(left, right);
            }
        }
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
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
}
