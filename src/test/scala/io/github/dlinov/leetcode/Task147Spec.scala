package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.Assertion

import scala.annotation.tailrec

class Task47Spec extends AnyWordSpec with Matchers {
  "Task 147, Insertion Sort List" must {
    val task = new Task147InsertionSortList
    type ListNode = Task147InsertionSortList#ListNode
    val s = new task.Solution

    "sort [4->2->1->3]" in {
      val toSort = new task.ListNode(4, 
        new task.ListNode(2,
          new task.ListNode(1,
            new task.ListNode(3))))
      val expected: ListNode = new task.ListNode(1,
        new task.ListNode(2,
          new task.ListNode(3,
            new task.ListNode(4))))
      val sorted: ListNode = s.insertionSortList(toSort)
      test(sorted, expected)
    }

    "sort [-1->5->3->4->0]" in {
      val toSort: ListNode = new task.ListNode(-1, 
        new task.ListNode(5,
          new task.ListNode(3,
            new task.ListNode(4,
              new task.ListNode(0)))))
      val expected = new task.ListNode(-1, 
        new task.ListNode(0,
          new task.ListNode(3,
            new task.ListNode(4,
              new task.ListNode(5)))))
      val sorted = s.insertionSortList(toSort)
      test(sorted, expected)
    }

    "sort [1->1]" in {
      val toSort = new task.ListNode(1, 
        new task.ListNode(1))
      val expected = new task.ListNode(1, 
        new task.ListNode(1))
      val sorted = s.insertionSortList(toSort)
      test(sorted, expected)
    }

    "sort [4,3,2,1,0]" in {
      val toSort: ListNode = new task.ListNode(4, 
        new task.ListNode(3,
          new task.ListNode(2,
            new task.ListNode(1,
              new task.ListNode(0)))))
      val expected = new task.ListNode(0, 
        new task.ListNode(1,
          new task.ListNode(2,
            new task.ListNode(3,
              new task.ListNode(4)))))
      val sorted = s.insertionSortList(toSort)
      test(sorted, expected)
    }

    "sort [4,19,14,5,-3,1,8,5,11,15]" in {
      val toSort: ListNode = new task.ListNode(4, 
        new task.ListNode(19,
          new task.ListNode(14,
            new task.ListNode(5,
              new task.ListNode(-3,
                new task.ListNode(1,
                  new task.ListNode(8,
                    new task.ListNode(5,
                      new task.ListNode(11,
                        new task.ListNode(15))))))))))
      val expected = new task.ListNode(-3, 
        new task.ListNode(1,
          new task.ListNode(4,
            new task.ListNode(5,
              new task.ListNode(5,
                new task.ListNode(8,
                  new task.ListNode(11,
                    new task.ListNode(14,
                      new task.ListNode(15,
                        new task.ListNode(19))))))))))
      val sorted = s.insertionSortList(toSort)
      test(sorted, expected)
    }

    @tailrec def test(actual: ListNode, expected: ListNode): Assertion = {
      if (actual != null ^ expected != null) fail(s"actual is $actual but expected is $expected")
      else if (actual == null && expected == null) succeed
      else if (actual.`val` != expected.`val`) fail(s"actual is ${actual.`val`} but expected is ${expected.`val`}")
      else test(actual.next, expected.next)
    }
  }
}
