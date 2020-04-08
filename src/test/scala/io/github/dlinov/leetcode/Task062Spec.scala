package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task062Spec extends AnyWordSpec with Matchers {
  "Task 62, Unique Paths" must {
    val task = new Task062UniquePaths()
    val s = new task.Solution();
    
    "be 3 for 3x2" in {
      s.uniquePaths(3, 2) should be (3)
    }
    
    "be 28 for 7x3" in {
      s.uniquePaths(7, 3) should be (28)
    }

    "be 1 for 1x1" in {
      s.uniquePaths(1, 1) should be (1)
    }

    "be 1 for 1x2" in {
      s.uniquePaths(1, 2) should be (1)
    }

    "be 1 for 2x1" in {
      s.uniquePaths(2, 1) should be (1)
    }

    "be 2 for 2x2" in {
      s.uniquePaths(2, 2) should be (2)
    }

    "be 1 for 1x1000" in {
      s.uniquePaths(1, 1000) should be (1)
    }
  }
}
