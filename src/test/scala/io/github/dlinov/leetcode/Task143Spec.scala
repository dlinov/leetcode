package io.github.dlinov.leetcode

import org.scalatest.Assertion
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import scala.annotation.tailrec

class Task143Spec extends AnyWordSpec with Matchers {
  private val task = new Task143ReorderList

  "Task 143, Reorder List" must {
    "reorder 1->2->3 as 1->3->2" in {
      val n3 = new task.ListNode(3);
      val n2 = new task.ListNode(2, n3);
      val n1 = new task.ListNode(1, n2);
      test(n1, "1->3->2")
    }
    
    "reorder 1->2->3->4 as 1->4->2->3" in {
      val n4 = new task.ListNode(4);
      val n3 = new task.ListNode(3, n4);
      val n2 = new task.ListNode(2, n3);
      val n1 = new task.ListNode(1, n2);
      test(n1, "1->4->2->3")
    }
    
    "reorder 1->2->3->4->5 as 1->5->2->4->3" in {
      val n5 = new task.ListNode(5);
      val n4 = new task.ListNode(4, n5);
      val n3 = new task.ListNode(3, n4);
      val n2 = new task.ListNode(2, n3);
      val n1 = new task.ListNode(1, n2);
      test(n1, "1->5->2->4->3")
    }
    
    "reorder 1->2->3->4->5->6 as 1->6->2->5->3->4" in {
      val n6 = new task.ListNode(6);
      val n5 = new task.ListNode(5, n6);
      val n4 = new task.ListNode(4, n5);
      val n3 = new task.ListNode(3, n4);
      val n2 = new task.ListNode(2, n3);
      val n1 = new task.ListNode(1, n2);
      test(n1, "1->6->2->5->3->4")
    }
    
    "reorder 1->2 as 1->2" in {
      val n2 = new task.ListNode(2);
      val n1 = new task.ListNode(1, n2);
      test(n1, "1->2")
    }
    
    "reorder 1 as 1" in {
      val n1 = new task.ListNode(1);
      test(n1, "1")
    }
    
    "reorder null as null" in {
      test(null, "")
    }
  }

  private def test(head: Task143ReorderList#ListNode, expected: String): Assertion = {
      val s = new task.Solution
      s.reorderList(head)
      printList(head) shouldBe(expected)
  }

  private def printList(head: Task143ReorderList#ListNode): String = {
    @tailrec def internalPrint(
      node: Task143ReorderList#ListNode,
      acc: String
    ): String = {
      if (node == null) acc
      else if (node.next == null) s"$acc${node.`val`}"
      else internalPrint(node.next, s"$acc${node.`val`}->")
    }
    internalPrint(head, "")
  }
  
}
