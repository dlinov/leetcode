package io.github.dlinov.leetcode;

public class Task226InvertBinaryTree {
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

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            final TreeNode right = invertTree(root.left);
            final TreeNode left = invertTree(root.right);
            root.right = right;
            root.left = left;
        }
        return root;
    }
}
}