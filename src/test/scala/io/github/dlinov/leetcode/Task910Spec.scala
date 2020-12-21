package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task910Spec extends AnyWordSpec with Matchers {
  "Task 910, Smallest Range II" must {
    val task = new Task910SmallestRangeII()

    "return 0 for [1] and K = 0" in {
      test(Array(1), 0, 0)
    }

    "return 6 for [0,10] and K = 2" in {
      test(Array(0, 10), 2, 6)
    }

    "return 3 for [1,3,6] and K = 3" in {
      test(Array(1, 3, 6), 3, 3)
    }

    def test(nums: Array[Int], k: Int, expectedOutput: Int) = {
      val solution = new task.Solution()
      val actual = solution.smallestRangeII(nums, k)
      actual should be (expectedOutput)
    }
  }
}
