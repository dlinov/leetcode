package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task543Spec extends AnyWordSpec with Matchers {
  "Task 543, Diameter of Binary Tree" must {
    val task = new Task543DiameterOfBinaryTree()
    val solution = new task.Solution()
    type TreeNode = task.TreeNode
    val `1` = new TreeNode(1)
    val `2` = new TreeNode(2)
    val `3` = new TreeNode(3)
    val `4` = new TreeNode(4)
    val `5` = new TreeNode(5)
    val `6` = new TreeNode(5)
    val `7` = new TreeNode(5)
    val `8` = new TreeNode(5)
    val allNodes = Seq(`1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`)

    def test(tree: TreeNode, expectedOutput: Integer) = {
      val actual = solution.diameterOfBinaryTree(tree)
      actual should be (expectedOutput)
    }

    def cleanNodes(): Unit = {
      allNodes.foreach { node =>
        node.left = null
        node.right = null
      }
    }
    
    """return 3 for
    |          1
    |         / \
    |        2   3
    |       / \     
    |      4   5
    |""".stripMargin in {
      cleanNodes()
      `1`.left = `2`
      `1`.right = `3`
      `2`.left = `4`
      `2`.right = `5`
      test(`1`, 3)
    }

    """return 4 for
    |            1
    |         /     \
    |        2       3
    |       / \     / \  
    |      4   5   6   7
    |""".stripMargin in {
      cleanNodes()
      `1`.left = `2`
      `1`.right = `3`
      `2`.left = `4`
      `2`.right = `5`
      `3`.left = `6`
      `3`.right = `7`
      test(`1`, 4)
    }

    "return 0 for single-node tree" in {
      cleanNodes()
      test(`1`, 0)
    }

    "return 0 for empty tree" in {
      cleanNodes()
      test(null, 0)
    }
  }
}
