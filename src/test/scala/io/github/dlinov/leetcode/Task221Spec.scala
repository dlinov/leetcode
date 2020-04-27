package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task221Spec extends AnyWordSpec with Matchers {
  private val t = new Task221MaximalSquare
  private val s = new t.Solution

  "Task 221, Maximal Square" must {
    """return 4 for
    |1 0 1 0 0
    |1 0 1 1 1
    |1 1 1 1 1
    |1 0 0 1 0""".stripMargin in {
      val input = Array(
        Array('1','0','1','0','0'),
        Array('1','0','1','1','0'),
        Array('1','1','1','1','1'),
        Array('1','0','0','1','0')
      )
      s.maximalSquare(input) should be(4)
    }

    """return 0 for
    |0 0 0 0 0
    |0 0 0 0 0
    |0 0 0 0 0
    |0 0 0 0 0""".stripMargin in {
      val input = Array(
        Array('0','0','0','0','0'),
        Array('0','0','0','0','0'),
        Array('0','0','0','0','0'),
        Array('0','0','0','0','0')
      )
      s.maximalSquare(input) should be(0)
    }

    """return 1 for
    |0 0 0 0 0
    |0 0 0 0 0
    |0 0 0 0 0
    |0 0 0 0 1""".stripMargin in {
      val input = Array(
        Array('0','0','0','0','0'),
        Array('0','0','0','0','0'),
        Array('0','0','0','0','0'),
        Array('0','0','0','0','1')
      )
      s.maximalSquare(input) should be(1)
    }
    
    """return 1 for
    |1 0 0 0 0
    |0 0 0 0 0
    |0 0 0 0 0
    |0 0 0 0 0""".stripMargin in {
      val input = Array(
        Array('1','0','0','0','0'),
        Array('0','0','0','0','0'),
        Array('0','0','0','0','0'),
        Array('0','0','0','0','0')
      )
      s.maximalSquare(input) should be(1)
    }

    """return 4 for
    |0 1 1 0 0 1 0 1 0 1
    |0 0 1 0 1 0 1 0 1 0
    |1 0 0 0 0 1 0 1 1 0
    |0 1 1 1 1 1 1 0 1 0
    |0 0 1 1 1 1 1 1 1 0
    |1 1 0 1 0 1 1 1 1 0
    |0 0 0 1 1 0 0 0 1 0
    |1 1 0 1 1 0 0 1 1 1
    |0 1 0 1 1 0 1 0 1 1""".stripMargin in {
      val input = Array(
        Array('0','1','1','0','0','1','0','1','0','1'),
        Array('0','0','1','0','1','0','1','0','1','0'),
        Array('1','0','0','0','0','1','0','1','1','0'),
        Array('0','1','1','1','1','1','1','0','1','0'),
        Array('0','0','1','1','1','1','1','1','1','0'),
        Array('1','1','0','1','0','1','1','1','1','0'),
        Array('0','0','0','1','1','0','0','0','1','0'),
        Array('1','1','0','1','1','0','0','1','1','1'),
        Array('0','1','0','1','1','0','1','0','1','1'),
      )
      s.maximalSquare(input) should be(4)
    }

    "return 1 for chess board NxN, N = 1000".stripMargin in {
      val input = generateChessBoard(1000)
      s.maximalSquare(input) should be(1)
    }
  }

  private def generateChessBoard(n: Int): Array[Array[Char]] = {
    val w = chessIterator(true)
    val b = chessIterator(false)
    (1 to n).foldLeft(List.empty[Array[Char]]) {
        (acc, i) => acc :+ (if (i % 2 == 0) w else b).take(n).toArray
      }.toArray
  }

  private def chessIterator(startWithWhite: Boolean): Iterator[Char] = {
    val elems = if (startWithWhite) List('0', '1') else List('1', '0')
    Iterator.continually(elems).flatten
  }
}
