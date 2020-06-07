package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task518Spec extends AnyWordSpec with Matchers {
  "Task 518, Coin Change 2" must {
    val task = new Task518CoinChange2()
    
    "return 4 for [1,2,5] and 5" in {
      test(Array(1, 2, 5), 5, 4)
    }

    "return 1 for [1,2,5] and 0" in {
      test(Array(1, 2, 5), 0, 1)
    }

    "return 1 for [1,2] and 1" in {
      test(Array(1, 2), 1, 1)
    }

    "return 2 for [1,2] and 3" in {
      test(Array(1, 2), 3, 2)
    }

    def test(coins: Array[Int], amount: Int, expectedOutput: Int) = {
      val s = new task.Solution()
      val actual = s.change(amount, coins)
      actual should be (expectedOutput)
    }
  }
}
