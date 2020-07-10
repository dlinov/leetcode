package io.github.dlinov.leetcode

import org.scalatest.Assertion
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

import scala.annotation.tailrec

class Task430Spec extends AnyWordSpec with Matchers {
  "Task 430, Flatten a Multilevel Doubly Linked List" must {
    val task = new Task430FlattenAMultilevelDoublyLinkedList
    type Node = Task430FlattenAMultilevelDoublyLinkedList#Node
    
    "return [] for []" in {
      test(null, null)
    }
    
    "return [1,3,2] for [1,2,null,3]" in {
      val raw = n(1, n(2, null), Some(n(3, null)))
      val flattened = n(1, n(3, n(2, null)))
      test(raw, flattened)
    }
    
    "return [1,2,3,7,8,11,12,9,10,4,5,6] for [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]" in {
      val raw = n(1, n(2, n(3, n(4, n(5, n(6, null))), Some(n(7, n(8, n(9, n(10, null)), Some(n(11, n(12, null)))))))))
      val flattened = n(1, n(2, n(3, n(7, n(8, n(11, n(12, n(9, n(10, n(4, n(5, n(6, null))))))))))))
      test(raw, flattened)
    }

    def n(`val`: Int, next: Node, child: Option[Node] = None): Node = {
      val node = new task.Node
      node.`val` = `val`
      node.next = next;
      Option(next).foreach(_.prev = node)
      child.foreach(node.child = _)
      node
    }

    def test(input: Node, expected: Node): Assertion = {
      val s = new task.Solution
      val actual = s.flatten(input)
      @tailrec def validate(a: Node, e: Node): Assertion = {
        if (a == null && e == null) {
          succeed
        } else {
          // println(s"validating a: ${a.`val`}, e: ${e.`val`}")
          a.`val` should be (e.`val`)
          a.child should be (null)
          // println(s"validating a.next: ${a.next}, e.next: ${e.next}")
          Option(a.next).fold(a.next should be (e.next)) { _.`val` should be (e.next.`val`) }
          // println(s"validating a.prev: ${a.prev}, e.prev: ${e.prev}")
          Option(a.prev).fold(a.prev should be (e.prev)) { _.`val` should be (e.prev.`val`) }
          validate(a.next, e.next)
        }
      }
      validate(actual, expected)
    }
  }
}
