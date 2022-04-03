package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task572Spec extends AnyWordSpec with Matchers {
  private val task = new Task572SubtreeOfAnotherTree
  private val solution = new task.Solution()
  private type TreeNode = task.TreeNode

  "Task 572, Subtree of Another Tree" should {
    "return true for [3,4,5,1,2] and [4,1,2]" in {
      val root = new TreeNode(3,
        new TreeNode(4,
          new TreeNode(1),
          new TreeNode(2)),
        new TreeNode(5))
      val subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2))
      solution.isSubtree(root, subRoot) should be (true)
    }

    "return false for [3,4,5,1,2,null,null,null,null,0] and [4,1,2]" in {
      val root = new TreeNode(3,
        new TreeNode(4,
          new TreeNode(1),
          new TreeNode(2,
            new TreeNode(0),
            null)),
        new TreeNode(5))
      val subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2))
      solution.isSubtree(root, subRoot) should be (false)
    }

    "return true for [1,1] and [1]" in {
      val root = new TreeNode(1, new TreeNode(1), null)
      val subRoot = new TreeNode(1)
      solution.isSubtree(root, subRoot) should be (true)
    }

    "return false for [3,4,5,1,null,2] and [3,1,2]" in {
      val root = new TreeNode(3,
        new TreeNode(4,
          new TreeNode(1),
          null),
        new TreeNode(5,
          new TreeNode(2),
          null))
      val subRoot = new TreeNode(3, new TreeNode(1), new TreeNode(2))
      solution.isSubtree(root, subRoot) should be (false)
    }
  }
}
