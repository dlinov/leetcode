package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task704Spec extends AnyWordSpec with Matchers {
  "Task 704, Binary Search" should {
    "return 4 for nums = [-1,0,3,5,9,12], target = 9" in {
      test(Array(-1, 0, 3, 5, 9, 12), 9, 4)
    }

    "return -1 for nums = [-1,0,3,5,9,12], target = 2" in {
      test(Array(-1, 0, 3, 5, 9, 12), 2, -1)
    }
  }

  private def test(nums: Array[Int], target: Int, expectedOutput: Int) = {
    val t = new Task704BinarySearch
    val s = new t.Solution
    s.search(nums, target) should be(expectedOutput)
  }
}
