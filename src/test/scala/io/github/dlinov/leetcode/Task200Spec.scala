package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task200Spec extends AnyWordSpec with Matchers {
  "Task 200, Number of Islands" must {
    val task = new Task200NumberOfIslands()
    
    """
    |return 1 for
    |  11110
    |  11010
    |  11000
    |  00000""".stripMargin in {
        val grid = Array(
          "11110".toCharArray(),
          "11010".toCharArray(),
          "11000".toCharArray(),
          "00000".toCharArray(),
        )
        test(grid, 1)
    }
    
    """
    |return 3 for
    |  11000
    |  11000
    |  00100
    |  00011""".stripMargin in {
        val grid = Array(
          "11000".toCharArray(),
          "11000".toCharArray(),
          "00100".toCharArray(),
          "00011".toCharArray(),
        )
        test(grid, 3)
    }

    def test(grid: Array[Array[Char]], expectedOutput: Int) = {
        val s = new task.Solution()
        val actual = s.numIslands(grid)
        actual should be (expectedOutput)
    }
  }
}