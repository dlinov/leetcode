package io.github.dlinov.leetcode1k

import org.scalatest.Assertion
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task1539Spec extends AnyWordSpec with Matchers {
  private val task = new Task1539KthMissingPositiveNumber
  private val s = new task.Solution

  "Task 1539, Kth Missing Positive Number" must {
    "return 9 for [2,3,4,7,11] and k = 5" in {
      test(Array(2, 3, 4, 7, 11), 5, 9)
    }

    "return 6 for [1,2,3,4] and 2" in {
      test(Array(1, 2, 3, 4), 2, 6)
    }

    "return 1 for [2] and 1" in {
      test(Array(2), 1, 1)
    }
  }

  private def test(arr: Array[Int], k: Int, expected: Int): Assertion = {
    val actual = s.findKthPositive(arr, k)
    actual should be(expected)
  }
}

