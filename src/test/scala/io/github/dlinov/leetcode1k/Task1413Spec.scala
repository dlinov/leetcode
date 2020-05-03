package io.github.dlinov.leetcode1k

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task1413Spec extends AnyWordSpec with Matchers {
  private val t = new Task1413MinimumValueToGetPositiveStepByStepSum();
  private val s = new t.Solution();

  "Contest Task 1" must {
    "return 5 for [-3,2,-3,4,2]" in {
      s.minStartValue(Array(-3, 2, -3, 4, 2)) should be(5)
    }

    "return 1 for [1,2]" in {
      s.minStartValue(Array(1, 2)) should be(1)
    }

    "return 5 for [1,-2,-3]" in {
      s.minStartValue(Array(1, -2, -3)) should be(5)
    }

    "return 1 for [0]" in {
      s.minStartValue(Array(0)) should be(1)
    }

    "return 1 for []" in {
      s.minStartValue(Array(0)) should be(1)
    }

    "return 1 for [2,3,5,-5,-1]" in {
      s.minStartValue(Array(2, 3, 5, -5, -1)) should be(1)
    }
  }
  
}
