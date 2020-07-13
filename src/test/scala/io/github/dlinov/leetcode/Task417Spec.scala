package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.jdk.CollectionConverters._

class Task417Spec extends AnyWordSpec with Matchers {
  "Task 417, Pacific Atlantic Water Flow" must {
    val task = new Task417PacificAtlanticWaterFlow()
    
    "return [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] for example test case" in {
      val input = Array(
        Array(1, 2, 2, 3, 5),
        Array(3, 2, 3, 4, 4),
        Array(2, 4, 5, 3, 1),
        Array(6, 7, 1, 4, 5),
        Array(5, 1, 1, 2, 4)
      )
      val expected = List(
        List(0, 4),
        List(1, 3),
        List(1, 4),
        List(2, 2),
        List(3, 0),
        List(3, 1),
        List(4, 0)
      )
      test(input, expected)
    }

    "return [[0, 1], [0, 2], [1, 0], [1, 1] [1, 2], [2, 1], [2, 2], [3, 0], [3, 1]] for smaller test case" in {
      val input = Array(
        Array(1, 2, 2),
        Array(3, 2, 3),
        Array(1, 2, 2),
        Array(6, 7, 1)
      )
      val expected = List(
        List(0, 1),
        List(0, 2),
        List(1, 0),
        List(1, 1),
        List(1, 2),
        List(2, 1),
        List(2, 2),
        List(3, 0),
        List(3, 1)
      )
      test(input, expected)
    }

    "return [] for []" in {
      val input = Array.empty[Array[Int]]
      val expected = List.empty[List[Int]]
      test(input, expected)
    }

    "return [[0,2],[1,0],[1,1],[1,2],[2,0],[2,1],[2,2]] for [[1,2,3],[8,9,4],[7,6,5]]" in {
      val input = Array(
        Array(1, 2, 3),
        Array(8, 9, 4),
        Array(7, 6, 5)
      )
      val expected = List(
        List(0, 2),
        List(1, 0),
        List(1, 1),
        List(1, 2),
        List(2, 0),
        List(2, 1),
        List(2, 2)
      )
      test(input, expected)
    }

    def test(input: Array[Array[Int]], expectedOutput: List[List[Int]]) = {
      val s = new task.Solution()
      val actual = s.pacificAtlantic(input)
      actual.asScala.map(_.asScala) should be (expectedOutput)
    }
  }
}
