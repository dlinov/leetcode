package io.github.dlinov.leetcode1k

import org.scalatest.Assertion
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task1433Spec extends AnyWordSpec with Matchers {
  private val task = new Task1433CheckIfAStringCanBreakAnotherString
  private val s = new task.Solution

  "Task 1433, Check If a String Can Break Another String" must {
    "return true for 'abc' and 'xya'" in {
      test("abc", "xya", true)
    }

    "return false for 'abe' and 'acd'" in {
      test("abe", "acd", false)
    }

    "return true for 'leetcodee' and 'interview'" in {
      test("leetcodee", "interview", true)
    }
  }

  private def test(s1: String, s2: String, expected: Boolean): Assertion = {
    val actual = s.checkIfCanBreak(s1, s2)
    actual should be(expected)
  }
}
