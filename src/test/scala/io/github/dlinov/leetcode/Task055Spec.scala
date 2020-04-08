package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task055Spec extends AnyWordSpec with Matchers {
  "Task 55, Jump Game" must {
    val task = new Task055JumpGame()
    val s = new task.Solution();
    
    "determine it's possible to jump [2,3,1,1,4]" in {
        val nums = Array(2, 3, 1, 1, 4)
        s.canJump(nums) should be (true)
    }
    
    "determine it's impossible to jump [3,2,1,0,4]" in {
        val nums = Array(3, 2, 1, 0, 4)
        s.canJump(nums) should be (false)
    }
    
    "determine it's possible to jump [100]" in {
        val nums = Array(100)
        s.canJump(nums) should be (true)
    }
    
    "determine it's possible to jump [1,0]" in {
        val nums = Array(1,0)
        s.canJump(nums) should be (true)
    }
  }
}
