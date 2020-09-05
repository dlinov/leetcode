package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1305AllElementsInTwoBinarySearchTrees {
    class Solution {
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            final List<Integer> list1 = new ArrayList<>();
            final List<Integer> list2 = new ArrayList<>();
            loadTree(root1, list1);
            loadTree(root2, list2);
            final List<Integer> result = new ArrayList<>(list1.size() + list2.size());
            result.addAll(list1);
            result.addAll(list2);
            Collections.sort(result);
            return result;
        }
        
        private void loadTree(TreeNode node, List<Integer> list) {
            if (node != null) {
                list.add(node.val);
                loadTree(node.left, list);
                loadTree(node.right, list);
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
