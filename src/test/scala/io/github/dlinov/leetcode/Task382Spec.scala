package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import scala.annotation.tailrec

class Task382Spec extends AnyWordSpec with Matchers {
  "Task 382, Linked List Random Node" must {
    val task = new Task382LinkedListRandomNode()
    
    "return all values for [1,2,3]" in {
      test(Array(1, 2, 3))
    }
    
    "return all values for [1,2,3,4,5,6,7]" in {
      test(Array(1, 2, 3, 4, 5, 6, 7))
    }
    
    "return all values for [1]" in {
      test(Array(1))
    }

    def test(nums: Array[Int]) = {
      val head = new task.ListNode(nums(0))
      @tailrec def makeList(node: task.ListNode, i: Int): Unit = {
        if (i < nums.length) {
          val next = new task.ListNode(nums(i))
          node.next = next
          makeList(next, i + 1)
        }
        else ()
      }
      makeList(head, 1)
      val s = new task.Solution(head)
      val randomValues = (1 to 10000).map(_ => s.getRandom())
      randomValues.toSet should be(nums.toSet)
      val buckets = randomValues.groupBy(identity).values.map(_.size).toVector
      buckets.max.toDouble / buckets.min should be < 1.2
    }
  }
}
