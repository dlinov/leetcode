package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task036Spec extends AnyWordSpec with Matchers {
  "Task 36, Valid Sudoku" must {
    val task = new Task036ValidSudoku()
    val s = new task.Solution();
    
    "return true for valid sudoku" in {
      val board = Array(
        Array('1','2','3','4','5','6','7','8','9'),
        Array('4','5','6','.','.','.','.','.','.'),
        Array('7','8','9','.','.','.','.','.','.'),
        Array('.','.','1','.','.','.','.','.','.'),
        Array('.','.','4','.','.','.','.','.','.'),
        Array('.','.','7','.','.','.','.','.','.'),
        Array('.','.','2','.','.','.','.','.','.'),
        Array('.','.','5','.','.','.','.','.','.'),
        Array('.','.','8','.','.','.','.','.','.')
      )
      s.isValidSudoku(board) should be (true)
    }

    "return true for valid sudoku #2" in {
      val board = Array(
        Array('5','3','.','.','7','.','.','.','.'),
        Array('6','.','.','1','9','5','.','.','.'),
        Array('.','9','8','.','.','.','.','6','.'),
        Array('8','.','.','.','6','.','.','.','3'),
        Array('4','.','.','8','.','3','.','.','1'),
        Array('7','.','.','.','2','.','.','.','6'),
        Array('.','6','.','.','.','.','2','8','.'),
        Array('.','.','.','4','1','9','.','.','5'),
        Array('.','.','.','.','8','.','.','7','9')
      )
      s.isValidSudoku(board) should be (true)
    }
    
    "return true for empty sudoku" in {
      val board = Array(
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.'),
        Array('.','.','.','.','.','.','.','.','.')
      )
      s.isValidSudoku(board) should be (true)
    }
    
    "return false for invalid sudoku (row)" in {
      val board = Array(
        Array('1','2','3','1','5','6','7','8','9'),
        Array('4','5','6','.','.','.','.','.','.'),
        Array('7','8','9','.','.','.','.','.','.'),
        Array('.','.','1','.','.','.','.','.','.'),
        Array('.','.','4','.','.','.','.','.','.'),
        Array('.','.','7','.','.','.','.','.','.'),
        Array('.','.','2','.','.','.','.','.','.'),
        Array('.','.','5','.','.','.','.','.','.'),
        Array('.','.','8','.','.','.','.','.','.')
      )
      s.isValidSudoku(board) should be (false)
    }
    
    "return false for invalid sudoku (column)" in {
      val board = Array(
        Array('1','2','3','4','5','6','7','8','9'),
        Array('4','5','6','.','.','.','.','.','.'),
        Array('7','8','9','.','.','.','.','.','.'),
        Array('.','.','1','.','.','.','.','.','.'),
        Array('.','.','4','.','.','.','.','.','.'),
        Array('.','.','7','.','.','.','.','.','.'),
        Array('.','.','2','.','.','.','.','.','.'),
        Array('.','.','3','.','.','.','.','.','.'),
        Array('.','.','8','.','.','.','.','.','.')
      )
      s.isValidSudoku(board) should be (false)
    }

    "return false for invalid sudoku (subbox)" in {
      val board = Array(
        Array('1','2','3','4','5','6','7','8','9'),
        Array('4','5','6','.','.','.','.','.','.'),
        Array('2','8','9','.','.','.','.','.','.'),
        Array('.','.','1','.','.','.','.','.','.'),
        Array('.','.','4','.','.','.','.','.','.'),
        Array('.','.','7','.','.','.','.','.','.'),
        Array('.','.','2','.','.','.','.','.','.'),
        Array('.','.','5','.','.','.','.','.','.'),
        Array('.','.','8','.','.','.','.','.','.')
      )
      s.isValidSudoku(board) should be (false)
    }
  }
}
