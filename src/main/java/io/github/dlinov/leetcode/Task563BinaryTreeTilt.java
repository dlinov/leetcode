package io.github.dlinov.leetcode;

public class Task563BinaryTreeTilt {
    class Solution {
        private int totalTilt = 0;

        public int findTilt(TreeNode root) {
            totalTilt = 0;
            sum(root);
            return totalTilt;
        }
        
        private int sum(TreeNode node) {
            if (node == null) return 0;
            int leftSum = sum(node.left);
            int rightSum = sum(node.right);
            int tilt = Math.abs(leftSum - rightSum);
            totalTilt += tilt;
            return node.val + leftSum + rightSum;
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
