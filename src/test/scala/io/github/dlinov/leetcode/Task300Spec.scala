package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task300Spec extends AnyWordSpec with Matchers {

    "Task 300, Longest Increasing Subsequence" must {
        val task = new Task300LongestIncreasingSubsequence()

        def test(data: Array[Int], expectedOutput: Int) = {
            val s = new task.Solution()
            val actual = s.lengthOfLIS(data)
            actual should be (expectedOutput)
        }
        
        "return 4 for [10,9,2,5,3,7,101,18]" in {
            test(Array(10, 9, 2, 5, 3, 7, 101, 18), 4)
        }

        "return 3 for [1,2,3]" in {
            test(Array(1, 2, 3), 3)
        }

        "return 1 for [3,2,1]" in {
            test(Array(3, 2, 1), 1)
        }

        "return 2 for [2,1,3]" in {
            test(Array(2, 1, 3), 2)
        }

        "return 2 for [1,3,2]" in {
            test(Array(1, 3, 2), 2)
        }

        "return 2 for [2,3,1]" in {
            test(Array(2, 3, 1), 2)
        }

        "return 2 for [3,1,2]" in {
            test(Array(3, 1, 2), 2)
        }

        "return 3 for [4,10,4,3,8,9]" in {
            val s = new task.Solution()
            val nums = Array(4, 10, 4, 3, 8, 9)
            val expected = s.lengthOfLIS(nums)
            expected should be (3)
        }

        "return 0 for []" in {
            val s = new task.Solution()
            val nums = Array.empty[Int]
            val expected = s.lengthOfLIS(nums)
            expected should be (0)
        }

        "return 3 for [1,3,2,4]" in {
            val s = new task.Solution()
            val nums = Array(1, 3, 2, 4)
            val expected = s.lengthOfLIS(nums)
            expected should be (3)
        }
    }
}