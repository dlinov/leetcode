package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task057Spec extends AnyWordSpec with Matchers {
  "Task 57, Insert Interval" must {
    val task = new Task057InsertInterval
    val s = new task.Solution();
    
    "merge [2,5] into [[1,3],[6,9]]" in {
      val intervals = Array(Array(1,3), Array(6,9))
      val newInterval = Array(2, 5)
      s.insert(intervals, newInterval) should be (Array(Array(1, 5), Array(6, 9)))
    }
    
    "merge [4,8] into [[1,2],[3,5],[6,7],[8,10],[12,16]]" in {
      val intervals = Array(Array(1, 2), Array(3, 5), Array(6, 7), Array(8, 10), Array(12, 16))
      val newInterval = Array(4, 8)
      s.insert(intervals, newInterval) should be (Array(Array(1, 2), Array(3, 10), Array(12, 16)))
    }
    
    "merge [1,3] into [[3,4],[6,9]]" in {
      val intervals = Array(Array(3, 4), Array(6, 9))
      val newInterval = Array(1, 3)
      s.insert(intervals, newInterval) should be (Array(Array(1, 4), Array(6, 9)))
    }
    
    "merge [10,15] into [[3,4],[6,9]]" in {
      val intervals = Array(Array(3, 4), Array(6, 9))
      val newInterval = Array(10, 15)
      s.insert(intervals, newInterval) should be (Array(Array(3, 4), Array(6, 9), Array(10, 15)))
    }
    
    "merge [2,4] into [[1,3],[4,9]]" in {
      val intervals = Array(Array(1, 3), Array(4, 9))
      val newInterval = Array(2, 4)
      s.insert(intervals, newInterval) should be (Array(Array(1, 9)))
    }
    
    "merge [0,0] into [[1,5]]" in {
      val intervals = Array(Array(1, 5))
      val newInterval = Array(0, 0)
      s.insert(intervals, newInterval) should be (Array(Array(0, 0), Array(1, 5)))
    }
    
    "merge [2,2] into [[0,1],[3,4]]" in {
      val intervals = Array(Array(0, 1), Array(3, 4))
      val newInterval = Array(2, 2)
      s.insert(intervals, newInterval) should be (Array(Array(0, 1), Array(2, 2), Array(3, 4)))
    }
  }
}
