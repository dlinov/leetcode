package io.github.dlinov.leetcode1k;

public class Task1026MaximumDifferenceBetweenNodeAndAncestor {
    class Solution {
        public int maxAncestorDiff(TreeNode root) {
            if (root == null) return 0;
            return helper(root, root.val, root.val);
        }
    
        public int helper(TreeNode node, int curMax, int curMin) {
            if (node == null) return curMax - curMin;
            curMax = Math.max(curMax, node.val);
            curMin = Math.min(curMin, node.val);
            final int left = helper(node.left, curMax, curMin);
            final int right = helper(node.right, curMax, curMin);
            return Math.max(left, right);
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
}
