package io.github.dlinov.leetcode1k

import org.scalatest.Assertion
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task1673Spec extends AnyWordSpec with Matchers {
  private val task = new Task1673FindTheMostCompetitiveSubsequence
  private val s = new task.Solution

  "Task 1673, Find the Most Competitive Subsequence" must {
    "return [2,6] for [3,5,2,6] and k = 2" in {
      test(Array(3, 5, 2, 6), 2, Array(2, 6))
    }

    "return [2,3,3,4] for [2,4,3,3,5,4,9,6] and k = 4" in {
      test(Array(2, 4, 3, 3, 5, 4, 9, 6), 4, Array(2, 3, 3, 4))
    }

    "return first 50000 for 100000 and k = 50000" in {
      val input = (1 to 100000).toArray
      val expected = (1 to 50000).toArray
      test(input, 50000, expected)
    }
  }

  private def test(arr: Array[Int], k: Int, expected: Array[Int]): Assertion = {
    val actual = s.mostCompetitive(arr, k)
    actual should be(expected)
  }
}
