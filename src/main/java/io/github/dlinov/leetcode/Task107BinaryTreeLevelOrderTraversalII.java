package io.github.dlinov.leetcode;

import java.util.*;

public class Task107BinaryTreeLevelOrderTraversalII {
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            final TreeMap<Integer, List<Integer>> levelsMap = new TreeMap<>();
            walkTree(root, 0, levelsMap);
            final List<List<Integer>> result = new ArrayList<>();
            for (Integer level : levelsMap.descendingKeySet()) {
                result.add(levelsMap.get(level));
            }
            return result;  
        }
        
        private void walkTree(TreeNode node, int level, Map<Integer, List<Integer>> levelsMap) {
            if (node != null) {
                final List<Integer> levelItems = levelsMap.computeIfAbsent(level, x -> new ArrayList<Integer>());
                levelItems.add(node.val);
                walkTree(node.left, level + 1, levelsMap);
                walkTree(node.right, level + 1, levelsMap);
            }
            
        }
    }

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