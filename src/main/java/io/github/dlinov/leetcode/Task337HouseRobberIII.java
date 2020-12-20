package io.github.dlinov.leetcode;

public class Task337HouseRobberIII {
    class Solution {
        public int rob(TreeNode root) {
            return Math.max(
                innerRob(root, true),
                innerRob(root, false)
            );
        }

        private int innerRob(TreeNode node, boolean parentRobbed) {
            if (node == null) return 0;
            final int notRobbed = innerRob(node.right, false) + innerRob(node.left, false);
            final int robbed = parentRobbed
                ? 0
                : innerRob(node.left, true) + innerRob(node.right, true) + node.val;
            return Math.max(notRobbed, robbed);
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
