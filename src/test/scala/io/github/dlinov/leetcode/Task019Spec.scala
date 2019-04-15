package io.github.dlinov.leetcode

import org.scalatest._

import scala.annotation.tailrec

class Task019Spec extends WordSpec with Matchers {
    "Task 19, Remove Nth Node From End of List" must {
        val task = new Task019RemoveNthNodeFromEndOfList()
        val s = new task.Solution()
        
        @tailrec def printList(list: Task019RemoveNthNodeFromEndOfList#ListNode): Unit = {
            if (list != null) {
                // print(list.`val`)
                printList(list.next)
            } else {
                // println("\n====================");
            }
        }
        
        "correctly remove every node from list 1..9" in {
            (1 to 9).foreach { i =>
                val n9 = new task.ListNode(9);
                n9.next = null;
                val n8 = new task.ListNode(8);
                n8.next = n9;
                val n7 = new task.ListNode(7);
                n7.next = n8;
                val n6 = new task.ListNode(6);
                n6.next = n7;
                val n5 = new task.ListNode(5);
                n5.next = n6;
                val n4 = new task.ListNode(4);
                n4.next = n5;
                val n3 = new task.ListNode(3);
                n3.next = n4;
                val n2 = new task.ListNode(2);
                n2.next = n3;
                val n1 = new task.ListNode(1);
                n1.next = n2;
                val list = s.removeNthFromEnd(n1, i);
                // println(s"Solution for $i:");
                printList(list)
            }
            succeed
        }
    }
}
