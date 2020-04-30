package io.github.dlinov.leetcode.unlisted;

public class CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree {
/* Definition for a binary tree node. */
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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return bfs(root, arr, 0);
    }

    private boolean bfs(TreeNode node, int[] arr, int k) {
        if (node == null) return false;
        if (node.val != arr[k]) return false;
        if (k + 1 == arr.length) return node.left == null && node.right == null;
        return bfs(node.left, arr, k + 1) || bfs(node.right, arr, k + 1);
    }
}
}