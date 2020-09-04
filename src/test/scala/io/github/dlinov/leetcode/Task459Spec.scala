package io.github.dlinov.leetcode

import org.scalatest.Assertion
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task459Spec extends AnyWordSpec with Matchers {

  "Task 459, Repeated Substring Pattern" must {
    "return true for abab" in {
      test("abab", true)
    }
    "return false for aba" in {
      test("aba", false)
    }
    "return true for abcabcabcabc" in {
      test("abcabcabcabc", true)
    }
    "return true for bb" in {
      test("bb", true)
    }
  }

  private def test(input: String, expected: Boolean): Assertion = {
    val task = new Task459RepeatedSubstringPattern
    val s = new task.Solution
    s.repeatedSubstringPattern(input) should be (expected)
  }
}