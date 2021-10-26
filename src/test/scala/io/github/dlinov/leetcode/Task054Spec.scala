package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

import scala.jdk.CollectionConverters._

class Task054Spec extends AnyWordSpec with Matchers {
  "Task 54, Spiral Matrix" must {
    val task = new Task054SpiralMatrix()
    val s = new task.Solution()

    "traverse [[]] to []" in {
      val nums = Array(
        Array.emptyIntArray
      )
      s.spiralOrder(nums).asScala should be (List.empty[Int])
    }

    "traverse [[1]] to [1]" in {
      val nums = Array(
        Array(1)
      )
      s.spiralOrder(nums).asScala should be (List(1))
    }

    "traverse [[1,2],[3,4]] to [1,2,4,3]" in {
      val nums = Array(
        Array(1, 2),
        Array(3, 4)
      )
      s.spiralOrder(nums).asScala should be (List(1, 2, 4, 3))
    }

    "traverse [[1,2,3],[4,5,6],[7,8,9]] to [1,2,3,6,9,8,7,4,5]" in {
      val nums = Array(
        Array(1, 2, 3),
        Array(4, 5, 6),
        Array(7, 8, 9)
      )
      s.spiralOrder(nums).asScala should be (List(1, 2, 3, 6, 9, 8, 7, 4, 5))
    }

    "traverse [[1,2,3,4],[5,6,7,8],[9,10,11,12]] to [1,2,3,4,8,12,11,10,9,5,6,7]" in {
      val nums = Array(
        Array(1, 2, 3, 4),
        Array(5, 6, 7, 8),
        Array(9, 10, 11, 12)
      )
      s.spiralOrder(nums).asScala should be (List(1,2,3,4,8,12,11,10,9,5,6,7))
    }

    "traverse [[1,2],[3,4],[5,6]] to [1,2,4,6,5,3]" in {
      val nums = Array(
        Array(1, 2),
        Array(3, 4),
        Array(5, 6)
      )
      s.spiralOrder(nums).asScala should be (List(1,2,4,6,5,3))
    }

    "traverse [[1,2,3,4,5]] to [1,2,3,4,5]" in {
      val nums = Array(
        Array(1,2,3,4,5)
      )
      s.spiralOrder(nums).asScala should be (List(1,2,3,4,5))
    }

    "traverse [[1],[2],[3],[4],[5]] to [1,2,3,4,5]" in {
      val nums = Array(
        Array(1),
        Array(2),
        Array(3),
        Array(4),
        Array(5)
      )
      s.spiralOrder(nums).asScala should be (List(1,2,3,4,5))
    }
  }
}
