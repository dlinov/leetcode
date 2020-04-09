package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task844Spec extends AnyWordSpec with Matchers {
  "Task 844, Backspace String Compare" must {
    val task = new Task844BackspaceStringCompare()

    def test(s: String, t: String, expectedOutput: Boolean) = {
      val solution = new task.Solution()
      val actual = solution.backspaceCompare(s, t)
      actual should be (expectedOutput)
    }
    
    "be true for ab#c and ad#c" in {
      test("ab#c", "ad#c", true)
    }
    
    "be true for ab## and c#d#" in {
      test("ab##", "c#d#", true)
    }
    
    "be true for a##c and #a#c" in {
      test("a##c", "#a#c", true)
    }
    
    "be false for a#c and b" in {
      test("a#c", "b", false)
    }
  }
}
