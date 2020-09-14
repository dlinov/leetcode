package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task299Spec extends AnyWordSpec with Matchers {
  "Task 299, Bulls and Cows" must {
    val task = new Task299BullsAndCows
    val s = new task.Solution

    "return 1A3B for secret = 1807, guess = 7810" in {
      test("1807", "7810", "1A3B")
    }
    
    "return 1A1B for secret = 1123, guess = 0111" in {
      test("1123", "0111", "1A1B")
    }

    def test(secret: String,  guess: String, expectedOutput: String) = {
      val actual = s.getHint(secret, guess)
      actual should be (expectedOutput)
    }
  }
}
