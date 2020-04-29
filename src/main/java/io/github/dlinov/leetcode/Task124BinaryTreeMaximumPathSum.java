package io.github.dlinov.leetcode;

public class Task124BinaryTreeMaximumPathSum {
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
        private class Result {
            final TreeNode root;
            final int sum;
            Result(TreeNode root, int sum) {
                this.root = root;
                this.sum = sum;
            }
        }

        private int max;

        public int maxPathSum(TreeNode root) {
            max = Integer.MIN_VALUE;
            inner(root, new Result(root, Integer.MIN_VALUE));
            return max;
        }

        private Result inner(TreeNode root, Result curMax) {
            if (root == null) return curMax;
            final Result rMax = inner(root.right, curMax);
            final Result lMax = inner(root.left, curMax);
            Result res = curMax;
            int sum = curMax.sum;
            final boolean isRightLinked = rMax.root == root.right;
            final boolean isLeftLinked = lMax.root == root.left;
            if (isRightLinked && isLeftLinked) {
                // we cannot proceed with path if we include both branches
                max = Math.max(rMax.sum + lMax.sum + root.val, max);
            }
            if (isRightLinked && (rMax.sum + root.val > sum)) {
                sum = rMax.sum + root.val;
            }
            if (isLeftLinked && (lMax.sum + root.val > sum)) {
                sum = lMax.sum + root.val;
            }
            if (root.val > sum) {
                sum = root.val;
            }
            if (sum > curMax.sum) res = new Result(root, sum);
            max = Math.max(res.sum, max);
            return res;
        }
    }
}
