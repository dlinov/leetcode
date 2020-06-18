package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task275Spec extends AnyWordSpec with Matchers {
  "Task 275, H-Index II" must {
    val task = new Task275HIndexII
    val s = new task.Solution

    "return 0 for [0]" in {
      test(Array(0), 0)
    }
    
    "return 1 for [1]" in {
      test(Array(1), 1)
    }

    "return 3 for [0,1,3,5,6]" in {
      test(Array(0, 1, 3, 5, 6), 3)
    }

    "return 5 for [10,20,30,40,50]" in {
      test(Array(10, 20, 30, 40, 50), 5)
    }

    "return 3 for [0,1,3,5,6,7]" in {
      test(Array(0, 1, 3, 5, 6, 7), 3)
    }

    "return 4 for [0,1,3,5,6,7,11]" in {
      test(Array(0, 1, 3, 5, 6, 7, 11), 4)
    }

    "return 4 for [0,1,3,4,6,7,11,19]" in {
      test(Array(0, 1, 3, 4, 6, 7, 11, 19), 4)
    }

    "return 5 for [0,1,3,5,6,7,11,19]" in {
      test(Array(0, 1, 3, 5, 6, 7, 11, 19), 5)
    }

    "return 7 for [0,1,3,5,6,7,11,19,50,200,250,330]" in {
      test(Array(0, 1, 3, 5, 6, 7, 11, 19, 50, 200, 250, 330), 7)
    }

    def test(input: Array[Int], expectedOutput: Int) = {
      val actual = s.hIndex(input)
      actual should be (expectedOutput)
    }
  }
}
