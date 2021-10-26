package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task079Spec extends AnyWordSpec with Matchers {
  "Task 79, Word Search" must {
    val task = new Task079WordSearch()
    val s = new task.Solution()

    "find ABCCED" in {
      val board = Array(
        "ABCE".toCharArray,
        "SFCS".toCharArray,
        "ADEE".toCharArray
      )
      s.exist(board, "ABCCED") should be (true)
    }

    "find SEE" in {
      val board = Array(
        "ABCE".toCharArray,
        "SFCS".toCharArray,
        "ADEE".toCharArray
      )
      s.exist(board, "SEE") should be (true)
    }
    
    "find ABCB" in {
      val board = Array(
        "ABCE".toCharArray,
        "SFCS".toCharArray,
        "ADEE".toCharArray
      )
      s.exist(board, "ABCB") should be (false)
    }
    
    "find a" in {
      val board = Array(
        "a".toCharArray
      )
      s.exist(board, "a") should be (true)
    }
  }
}
