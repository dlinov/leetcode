package io.github.dlinov.leetcode;

import java.util.*;

public class Task103BinaryTreeZigzagLevelOrderTraversal {
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);
            boolean reverse = false;
            while (!queue.isEmpty()) {
                TreeNode node;
                final int width = queue.size();
                final List<Integer> level = new ArrayList<>();
                for (int i = 0; i < width; ++i) {
                    node = queue.poll();
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                    if (reverse) level.add(0, node.val);
                    else level.add(node.val);
                }
                result.add(level);
                reverse = !reverse;
            }
            return result;
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