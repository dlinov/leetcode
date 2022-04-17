package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task647Spec extends AnyWordSpec with Matchers {
  private val task = new Task647PalindromicSubstrings

  "Task 647, Palindromic Substrings" should {
    "return 3 for \"abc\"" in {
      val solution = new task.Solution
      solution.countSubstrings("abc") should be (3)
    }

    "return 6 for \"aaa\"" in {
      val solution = new task.Solution
      solution.countSubstrings("aaa") should be (6)
    }

    "return 8 for \"baaba\"" in {
      val solution = new task.Solution
      solution.countSubstrings("baaba") should be (8)
    }
  }
}
