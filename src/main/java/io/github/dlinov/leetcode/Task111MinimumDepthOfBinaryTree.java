package io.github.dlinov.leetcode;

public class Task111MinimumDepthOfBinaryTree {
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            return minDepth(root, 1);
        }
        
        private int minDepth(TreeNode node, int depth) {
            if (node.left == null && node.right == null) return depth;
            if (node.left == null) {
                return minDepth(node.right, depth + 1);
            } else if (node.right == null) {
                return minDepth(node.left, depth + 1);
            } else {
                return Math.min(minDepth(node.left, depth + 1), minDepth(node.right, depth + 1));
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
