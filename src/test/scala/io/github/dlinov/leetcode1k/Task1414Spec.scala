package io.github.dlinov.leetcode1k

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task1414Spec extends AnyWordSpec with Matchers {
  private val t = new Task1414FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK();
  private val s = new t.Solution();

  "Contest Task 2" must {
    "return 2 for k = 7" in {
      s.findMinFibonacciNumbers(7) should be(2)
    }

    "return 2 for k = 10" in {
      s.findMinFibonacciNumbers(10) should be(2)
    }

    "return 3 for k = 19" in {
      s.findMinFibonacciNumbers(19) should be(3)
    }

    "return 2 for k = 26" in {
      s.findMinFibonacciNumbers(26) should be(2)
    }

    "return 3 for k = 27" in {
      s.findMinFibonacciNumbers(27) should be(3)
    }

    "return 1 for k = 701408733" in {
      s.findMinFibonacciNumbers(701408733) should be(1)
    }

    "return 21 for k = 701408732" in {
      s.findMinFibonacciNumbers(701408732) should be(21)
    }
  }
}
