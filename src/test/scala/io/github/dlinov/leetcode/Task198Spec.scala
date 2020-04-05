package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task198Spec extends AnyWordSpec with Matchers {

    "Task 198, House Robber" must {
        val task = new Task198HouseRobber()
        
        "return 4 for [1,2,3,1]" in {
            test(Array(1, 2, 3, 1), 4)
        }
        
        "return 12 for [2,7,9,3,1]" in {
            test(Array(2, 7, 9, 3, 1), 12)
        }
        
        "return 38 for [2,7,9,3,1,2,5,8,1,2,3,5,8,10,5]" in {
            test(Array(2, 7, 9, 3, 1, 2, 5, 8, 1, 2, 3, 5, 8, 10, 5), 38)
        }

        def test(nums: Array[Int], expectedOutput: Int) = {
            val s = new task.Solution()
            val actual = s.rob(nums)
            actual should be (expectedOutput)
        }
    }
}