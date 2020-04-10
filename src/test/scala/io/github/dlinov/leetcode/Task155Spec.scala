package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task155Spec extends AnyWordSpec with Matchers {
  "Task 155, Min Stack" must {
    val task = new Task155MinStack()
    
    "run custom scenario" in {
      val stack = new task.MinStack()
      stack.push(-2)
      stack.push(0)
      stack.push(-3)
      stack.getMin() should be (-3)
      stack.pop()
      stack.top() should be(0)
      stack.getMin() should be(-2)
    }
  }
}