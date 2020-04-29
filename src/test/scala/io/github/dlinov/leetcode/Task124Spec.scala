package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task124Spec extends AnyWordSpec with Matchers {
  private val t = new Task124BinaryTreeMaximumPathSum
  private val s = new t.Solution

  "Task 124, Binary Tree Maximum Path Sum" must {
    "return 3 for [1,2]" in {
      val root = {
        val tn2 = new t.TreeNode(2)
        val tn1 = new t.TreeNode(1, tn2, null)
        tn1
      }
      s.maxPathSum(root) should be(3)
    }

    "return 6 for [1,2,3]" in {
      val root = {
        val tn2 = new t.TreeNode(2)
        val tn3 = new t.TreeNode(3);
        val tn1 = new t.TreeNode(1, tn2, tn3)
        tn1
      }
      s.maxPathSum(root) should be(6)
    }

    "return 42 for [-10,9,20,null,null,15,7]" in {
      val root = {
        val tn6 = new t.TreeNode(15)
        val tn7 = new t.TreeNode(7)
        val tn2 = new t.TreeNode(9)
        val tn3 = new t.TreeNode(20, tn6, tn7)
        val tn1 = new t.TreeNode(-10, tn2, tn3)
        tn1
      }
      s.maxPathSum(root) should be(42)
    }

    "return 48 for [5,4,8,11,null,13,4,7,2,null,null,null,1]" in {
      val root = {
        val tn8 = new t.TreeNode(7)
        val tn9 = new t.TreeNode(2)
        val tn12 = null
        val tn13 = null
        val tn14 = null
        val tn15 = new t.TreeNode(1)
        val tn4 = new t.TreeNode(11, tn8, tn9)
        val tn5 = null
        val tn6 = new t.TreeNode(13, tn12, tn13)
        val tn7 = new t.TreeNode(4, tn14, tn15)
        val tn2 = new t.TreeNode(4, tn4, tn5)
        val tn3 = new t.TreeNode(8, tn6, tn7)
        val tn1 = new t.TreeNode(5, tn2, tn3)
        tn1
      }
      s.maxPathSum(root) should be(48)
    }

    "return 184 for [-5,6,7,-10,-12,8,9,null,50,150,null,10,15,20,25]" in {
      val root = {
        val tn8 = null
        val tn9 = new t.TreeNode(50)
        val tn10 = new t.TreeNode(150)
        val tn11 = null
        val tn12 = new t.TreeNode(10)
        val tn13 = new t.TreeNode(15)
        val tn14 = new t.TreeNode(20)
        val tn15 = new t.TreeNode(25)

        val tn4 = new t.TreeNode(-10, tn8, tn9)
        val tn5 = new t.TreeNode(-12, tn10, tn11)
        val tn6 = new t.TreeNode(8, tn12, tn13)
        val tn7 = new t.TreeNode(9, tn14, tn15)

        val tn2 = new t.TreeNode(6, tn4, tn5)
        val tn3 = new t.TreeNode(7, tn6, tn7)

        val tn1 = new t.TreeNode(-5, tn2, tn3)
        tn1
      }
      s.maxPathSum(root) should be(184)
    }

    "return 184 for [6,-10,-12,null,50,150,null]" in {
      val root = {
        val tn4 = null
        val tn5 = new t.TreeNode(50)
        val tn6 = new t.TreeNode(150)
        val tn7 = null

        val tn2 = new t.TreeNode(-10, tn4, tn5)
        val tn3 = new t.TreeNode(-12, tn6, tn7)

        val tn1 = new t.TreeNode(6, tn2, tn3)
        tn1
      }
      s.maxPathSum(root) should be(184)
    }

    "return 4 for [1,0,1,1,2,0,-1,0,1,-1,0,-1,0,1,0]" in {
      val root = {
        val tn8 = new t.TreeNode(0)
        val tn9 = new t.TreeNode(1)
        val tn10 = new t.TreeNode(-1)
        val tn11 = new t.TreeNode(0)
        val tn12 = new t.TreeNode(-1)
        val tn13 = new t.TreeNode(0)
        val tn14 = new t.TreeNode(1)
        val tn15 = new t.TreeNode(0)

        val tn4 = new t.TreeNode(1, tn8, tn9)
        val tn5 = new t.TreeNode(2, tn10, tn11)
        val tn6 = new t.TreeNode(0, tn12, tn13)
        val tn7 = new t.TreeNode(-1, tn14, tn15)

        val tn2 = new t.TreeNode(0, tn4, tn5)
        val tn3 = new t.TreeNode(1, tn6, tn7)

        val tn1 = new t.TreeNode(1, tn2, tn3)
        tn1
      }
      s.maxPathSum(root) should be(4)
    }

    "return -3 for [-3]" in {
      val root = new t.TreeNode(-3)
      s.maxPathSum(root) should be(-3)
    }
  }
}
