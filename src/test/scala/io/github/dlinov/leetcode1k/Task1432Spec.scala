package io.github.dlinov.leetcode1k

import org.scalatest.Assertion
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task1432Spec extends AnyWordSpec with Matchers {
  private val task = new Task1432MaxDifferenceYouCanGetFromChangingAnInteger
  private val s = new task.Solution

  "Task 1432, Max Difference You Can Get From Changing an Integer" must {
    "return 888 for 555" in {
      test(555, 888)
    }

    "return 8 for 9" in {
      test(9, 8)
    }

    "return 820000 for 123456" in {
      test(123456, 820000)
    }

    "return 80000 for 10000" in {
      test(10000, 80000)
    }

    "return 8700 for 9288" in {
      test(9288, 8700)
    }

    "return 8808050 for 1101057" in {
      test(1101057, 8808050)
    }   
  }

  private def test(num: Int, expected: Int): Assertion = {
    val actual = s.maxDiff(num)
    actual should be(expected)
  }
}