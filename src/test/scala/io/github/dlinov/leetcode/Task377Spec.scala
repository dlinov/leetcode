package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task377Spec extends AnyWordSpec with Matchers {

    "Task 377, Combination Sum IV" must {
        val task = new Task377CombinationSumIV()
        
        "return 7 for [1,2,3] and 4" in {
            test(Array(1, 2, 3), 4, 7)
        }
        
        "return 31489 for [1,2,3,4,5,6,7] and 16" in {
            test(Array(1, 2, 3, 4, 5, 6, 7), 16, 31489)
        }
        
        "return 0 for [2,4,6,8] and 15" in {
            test(Array(2, 4, 6, 8), 15, 0)
        }

        def test(nums: Array[Int], target: Int, expectedOutput: Int) = {
            val s = new task.Solution()
            val actual = s.combinationSum4(nums, target)
            actual should be (expectedOutput)
        }
    }
}