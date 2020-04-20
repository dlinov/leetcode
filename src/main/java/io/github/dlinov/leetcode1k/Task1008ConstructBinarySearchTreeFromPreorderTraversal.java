package io.github.dlinov.leetcode1k;


public class Task1008ConstructBinarySearchTreeFromPreorderTraversal {
    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        public TreeNode bstFromPreorder(int[] preorder) {
            int n = preorder.length;
            if (n == 0) return null;
            TreeNode root = new TreeNode(preorder[0]); 
            for (int i = 1; i < n; i++) {
                root = insert(root, preorder[i]);
            }
            return root;
        }
        
        private TreeNode insert(TreeNode root, int val) {
            if (root == null) return new TreeNode(val);
            if (val <= root.val) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
            return root;
        }
    }
}