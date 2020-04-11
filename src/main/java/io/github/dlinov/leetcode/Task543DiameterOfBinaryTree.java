package io.github.dlinov.leetcode;

import java.util.concurrent.atomic.AtomicInteger;

public class Task543DiameterOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        final var result = new AtomicInteger(0);
        depth(root, result);
        return result.get();
    }

    private int depth(TreeNode node, AtomicInteger outResult) {
        if (node == null) {
            return 0;
        }
        final int leftDepth = depth(node.left, outResult);
        final int rightDepth = depth(node.right, outResult);
        outResult.getAndUpdate(cur -> Math.max(cur, leftDepth + rightDepth));
        return Math.max(leftDepth, rightDepth) + 1;
    }
    }
}