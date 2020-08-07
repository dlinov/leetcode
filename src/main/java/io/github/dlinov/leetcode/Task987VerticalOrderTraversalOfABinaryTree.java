package io.github.dlinov.leetcode;

import java.util.*;

public class Task987VerticalOrderTraversalOfABinaryTree {
    class Solution {
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            TreeMap<Integer, TreeMap<Integer, List<Integer>>> vMap = new TreeMap<>();
            dfs(root, vMap, 0, 0);
            final List<List<Integer>> result = new ArrayList<>();
            for (Integer col : vMap.keySet()) {
                final List<Integer> vertical = new ArrayList<>();
                final TreeMap<Integer, List<Integer>> v = vMap.get(col);
                for (Integer row : v.descendingKeySet()) {
                    List<Integer> cell = v.get(row);
                    Collections.sort(cell);
                    vertical.addAll(cell);
                }
                result.add(vertical);
            }
            return result;
        }
        
        private void dfs(TreeNode node, TreeMap<Integer, TreeMap<Integer, List<Integer>>> vMap, int x, int y) {
            if (node == null) return;
            final TreeMap<Integer, List<Integer>> column = vMap.computeIfAbsent(x, z -> new TreeMap<>());
            final List<Integer> row = column.computeIfAbsent(y, z -> new ArrayList<>());
            row.add(node.val);
            dfs(node.left, vMap, x - 1, y - 1);
            dfs(node.right, vMap, x + 1, y - 1);
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
