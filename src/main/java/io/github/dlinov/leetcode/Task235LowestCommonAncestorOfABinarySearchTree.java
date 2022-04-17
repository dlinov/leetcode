package io.github.dlinov.leetcode;

class Task235LowestCommonAncestorOfABinarySearchTree {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) return null;
            final boolean isPLess = p.val < root.val;
            final boolean isQLess = q.val < root.val;
            final boolean isPorQEqual = p.val == root.val || q.val == root.val;
            if (isPLess && isQLess) return lowestCommonAncestor(root.left, p, q);
            if (!isPLess && !isQLess && !isPorQEqual) return lowestCommonAncestor(root.right, p, q);
            return root;
        }
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
