package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task201Spec extends AnyWordSpec with Matchers {
  "Task 201, Bitwise AND of Numbers Range" must {
    val task = new Task201BitwiseAndofNumbersRange()
    val s = new task.Solution()

    "return 4 for [5,7]" in {
      s.rangeBitwiseAnd(5, 7) should be(4)
    }

    "return 0 for [0,1]" in {
      s.rangeBitwiseAnd(0, 1) should be(0)
    }

    "return 0 for [1,2147483647]" in {
      s.rangeBitwiseAnd(1, 2147483647) should be(0)
    }

    "return 96 for [100,107]" in {
      s.rangeBitwiseAnd(100, 107) should be(96)
    }

    "return 0 for [31,33]" in {
      s.rangeBitwiseAnd(31, 33) should be(0)
    }

  }
  
}
