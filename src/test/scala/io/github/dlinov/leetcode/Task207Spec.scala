package io.github.dlinov.leetcode
  
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task207Spec extends AnyWordSpec with Matchers {

  "Task 207, Course Schedule" must {
    val task = new Task207CourseSchedule()
    val s = new task.Solution()

    "return true for 2 and [[1,0]]" in {
      val input = Array(Array(1, 0));
      s.canFinish(2, input) should be(true)
    }

    "return false for 2 and [[1,0], [0,1]]" in {
      val input = Array(Array(1, 0), Array(0, 1));
      s.canFinish(2, input) should be(false)
    }

    "return true for 5 and [[1,4], [0,1], [2,4], [4,3]]" in {
      val input = Array(Array(1, 4), Array(0, 1), Array(2, 4), Array(4, 3));
      s.canFinish(5, input) should be(true)
    }

    "return false for 5 and [[1,0], [2,1], [3,2], [0,3]]" in {
      val input = Array(Array(1, 0), Array(2, 1), Array(3, 2), Array(0, 3));
      s.canFinish(5, input) should be(false)
    }
  }
  
}
