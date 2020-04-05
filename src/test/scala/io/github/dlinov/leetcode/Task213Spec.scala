package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task213Spec extends AnyWordSpec with Matchers {

    "Task 213, House Robber II" must {
        val task = new Task213HouseRobberII()
        
        "return 4 for [1,2,3,1]" in {
            test(Array(1, 2, 3, 1), 4)
        }
        
        "return 3 for [2,3,2]" in {
            test(Array(2, 3, 2), 3)
        }

        "return 5 for [5]" in {
            test(Array(5), 5)
        }

        "return 3 for [2,3]" in {
            test(Array(2, 3), 3)
        }

        "return 3 for [3,1]" in {
            test(Array(3, 1), 3)
        }
        
        "return 11 for [2,7,9,3,1]" in {
            test(Array(2, 7, 9, 3, 1), 11)
        }

        def test(nums: Array[Int], expectedOutput: Int) = {
            val s = new task.Solution()
            val actual = s.rob(nums)
            actual should be (expectedOutput)
        }
    }
}