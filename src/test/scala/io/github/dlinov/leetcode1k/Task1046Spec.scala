package io.github.dlinov.leetcode1k

import org.scalatest.Assertion
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task1046Spec extends AnyWordSpec with Matchers {
  private val task = new Task1046LastStoneWeight
  private val solution = new task.Solution

  private def test(stones: Array[Int], expected: Int): Assertion = {
    val actual = solution.lastStoneWeight(stones)
    actual should be(expected)
  }

  "Task 1046, Last Stone Weight" must {
    "return 1 for [2,7,4,1,8,1]" in {
      test(Array(2,7,4,1,8,1), 1)
    }
  }
}
