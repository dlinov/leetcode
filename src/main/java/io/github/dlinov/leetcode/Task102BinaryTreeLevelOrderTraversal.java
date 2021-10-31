package io.github.dlinov.leetcode;

import java.util.*;

public class Task102BinaryTreeLevelOrderTraversal {
    class Solution {
        private TreeMap<Integer, List<Integer>> levels = new TreeMap<>();

        public List<List<Integer>> levelOrder(TreeNode root) {
            fillTree(root, 0);
            List<List<Integer>> result = new ArrayList<>(levels.size());
            for (var level : levels.navigableKeySet()) {
                result.add(levels.get(level));
            }
            return result;
        }

        private void fillTree(TreeNode node, int n) {
            if (node == null) return;
            final List<Integer> level = levels.computeIfAbsent(n, lvl -> new ArrayList<Integer>());
            level.add(node.val);
            fillTree(node.left, n + 1);
            fillTree(node.right, n + 1);
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
