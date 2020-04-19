package io.github.dlinov.leetcode1k

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task3Spec extends AnyWordSpec with Matchers {
  private val t = new Task1415TheKthLexicographicalStringOfAllHappyStringsOfLengthN();
  private val s = new t.Solution();

  "Contest Task 3" must {
    "return 'c' for n=1, k=3" in {
      s.getHappyString(1, 3) should be("c")
    }

    "return '' for n=1, k=4" in {
      s.getHappyString(1, 4) should be("")
    }

    "return 'cab' for n=3, k=9" in {
      s.getHappyString(3, 9) should be("cab")
    }

    "return '' for n=2, k=7" in {
      s.getHappyString(2, 7) should be("")
    }

    "return 'abacbabacb' for n=10, k=100" in {
      s.getHappyString(10, 100) should be("abacbabacb")
    }
  }
}
